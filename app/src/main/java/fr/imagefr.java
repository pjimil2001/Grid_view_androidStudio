package fr;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import com.example.gridview_main.R;
import com.example.gridview_main.dataadapter;
import com.example.gridview_main.datamodel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link imagefr#newInstance} factory method to
 * create an instance of this fragment.
 */
public class imagefr extends Fragment {



    GridView gridView;
    ArrayList<datamodel> dm = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public imagefr() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment imagefr.
     */
    // TODO: Rename and change types and number of parameters
    public static imagefr newInstance(String param1, String param2) {
        imagefr fragment = new imagefr();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_imagefr, container, false);



        gridView=v.findViewById(R.id.grid);

        dm.add( new datamodel("dsdewrws" ,R.drawable.img2));
        dm.add( new datamodel("dsds" , R.drawable.ic_launcher_foreground));
        dm.add( new datamodel("dswds", R.drawable.img1));
        dm.add( new datamodel("dsefwwfds", R.drawable.img3));
        dm.add( new datamodel("defsds", R.drawable.img4));
        dm.add( new datamodel("efdefsds", R.drawable.ic_launcher_background));
        dm.add( new datamodel("efdefdsds", R.drawable.img2));
        dm.add( new datamodel("dsdewrws" ,R.drawable.img2));
        dm.add( new datamodel("dsds" , R.drawable.ic_launcher_foreground));
        dm.add( new datamodel("dswds", R.drawable.img1));
        dm.add( new datamodel("dsefwwfds", R.drawable.img3));
        dm.add( new datamodel("defsds", R.drawable.img4));
        dm.add( new datamodel("dsdewrws" ,R.drawable.img2));
        dm.add( new datamodel("dsds" , R.drawable.ic_launcher_foreground));
        dm.add( new datamodel("dswds", R.drawable.img1));
        dm.add( new datamodel("dsefwwfds", R.drawable.img3));
        dm.add( new datamodel("defsds", R.drawable.img4));
        dm.add( new datamodel("efdsdfefsds", R.drawable.img4));
        dm.add( new datamodel("efdesdfsfsds", R.drawable.img3));
        dm.add( new datamodel("efdffsfsefsds", R.drawable.ic_launcher_background));
        dm.add( new datamodel("efdefsds", R.drawable.img1));
        dm.add( new datamodel("efdesffsds", R.drawable.ic_launcher_background));


        dataadapter d = new dataadapter(getContext(), dm);
        gridView.setAdapter(d);


        return v;
    }


}