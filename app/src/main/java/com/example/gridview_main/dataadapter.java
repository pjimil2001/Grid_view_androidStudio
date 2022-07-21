package com.example.gridview_main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class dataadapter extends ArrayAdapter<datamodel> {
    public dataadapter(@NonNull Context context, ArrayList<datamodel> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.view_main, parent, false);
        }



        datamodel datamodel = getItem(position);
        ImageView courseIV = listitemView.findViewById(R.id.img);
        TextView courseV = listitemView.findViewById(R.id.tv);

        courseIV.setImageResource(datamodel.getImgid());
        courseV.setText(datamodel.getName());


        return listitemView;
    }


}