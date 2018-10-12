package com.example.jakelipson.w5p3;


import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {


    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //GridView gv = getActivity().findViewById(R.id.gridView1);
        //gv.setAdapter(new GridViewAdapter(getActivity().getBaseContext()));

        return inflater.inflate(R.layout.fragment_top, container, false);
    }

}
