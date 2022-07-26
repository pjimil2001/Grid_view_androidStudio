package fr;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gridview_main.R;
import com.example.gridview_main.albumdapter;
import com.example.gridview_main.albummodel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link albumfr#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class albumfr extends Fragment {


    RecyclerView rv;
    ArrayList<albummodel> dm= new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment albumfr.
     */
    // TODO: Rename and change types and number of parameters
    public static albumfr newInstance(String param1, String param2) {
        albumfr fragment = new albumfr();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public albumfr() {
        // Required empty public constructor
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
         View v=inflater.inflate(R.layout.fragment_albumfr, container, false);

        rv=v.findViewById(R.id.recycler);


        dm.add(new albummodel(R.drawable.img4));
        dm.add(new albummodel(R.drawable.img2));
        dm.add(new albummodel(R.drawable.img3));



        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(new albumdapter(dm));

        return v;
    }

}