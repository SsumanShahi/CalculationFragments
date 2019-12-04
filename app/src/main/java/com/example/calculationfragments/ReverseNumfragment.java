package com.example.calculationfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseNumfragment extends Fragment implements View.OnClickListener {


    public ReverseNumfragment() {
        // Required empty public constructor
    }

    TextView etnum;
    Button btncheck;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse_numfragment, container, false);
        etnum=view.findViewById(R.id.etnum);
        btncheck=view.findViewById(R.id.btncheck);

        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return  view;
    }

    @Override
    public void onClick(View v) {

        int num, rev=0,rem;
        num=Integer.parseInt(etnum.getText().toString());

        while (num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;


        }
        Toast.makeText(getActivity(),"reverse is:"+rev,Toast.LENGTH_SHORT).show();

    }
}
