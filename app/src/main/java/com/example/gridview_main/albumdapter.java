package com.example.gridview_main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class albumdapter extends RecyclerView.Adapter<albumdapter.ViewHolder> {

    private List<albummodel> listdata;

    // RecyclerView recyclerView;
    public albumdapter(List<albummodel> listdata) {
        this.listdata = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.album_view, parent, false));
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final albummodel myListData = listdata.get(position);
        holder.ImageView.setImageResource(myListData.getImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "click on item: " + myListData.getImg(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.ImageView = itemView.findViewById(R.id.thumbnail);
        }
    }

}

