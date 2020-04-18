package com.pandorax.solutiontap;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Queries extends Fragment {


    public Queries() {
        // Required empty public constructor
    }


    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_queries, container, false);


        button = (Button) view.findViewById(R.id.qa);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),QA.class);
                startActivity(intent);

            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}
