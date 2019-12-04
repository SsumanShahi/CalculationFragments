package com.example.calculationfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class Reversestringfragment extends Fragment implements  View.OnClickListener {

private EditText ettext;
private Button btncheck;
 private TextView tvtext;
HashMap<Character,Integer>charCountMap;

    public Reversestringfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reversestringfragment, container, false);
        ettext=view.findViewById(R.id.ettext);
        btncheck=view.findViewById(R.id.btncheck);
        tvtext=view.findViewById(R.id.tvtext);
charCountMap=new HashMap<>();

        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
return view;

    }

    @Override
    public void onClick(View v) {

        if(!ettext.getText().toString().isEmpty()){
            StringBuffer c=new StringBuffer(ettext.getText().toString());
            tvtext.setText(c.reverse());
            Toast.makeText(getActivity(),"string reversed",Toast.LENGTH_SHORT).show();

        }
        else {
            ettext.setError("Empty field");
        }

    }
}
