package com.example.calculationfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Sumfragment extends Fragment implements View.OnClickListener{


    public Sumfragment() {
        // Required empty public constructor
    }


    Button btnadd;
    EditText etfirst,etsecond;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sumfragment, container, false);
        etfirst=view.findViewById(R.id.etfirst);
        etsecond=view.findViewById(R.id.etsecond);
        btnadd=view.findViewById(R.id.btnadd);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return  view;
    }


    @Override
    public void onClick(View v) {
        int first=Integer.parseInt(etfirst.getText().toString());
        int second=Integer.parseInt(etsecond.getText().toString());
                int result=first+second;
        Toast.makeText(getActivity(),"the sum is:"+result,Toast.LENGTH_SHORT).show();
    }
}
