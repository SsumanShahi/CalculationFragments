package com.example.calculationfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Palindromefragment extends Fragment implements View.OnClickListener {


    public Palindromefragment() {
        // Required empty public constructor
    }

    EditText etnum;
    TextView tvmessage;
    Button btncheck;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindromefragment, container, false);

      etnum=  view.findViewById(R.id.etnum);
      tvmessage=view.findViewById(R.id.tvmessage);
      btncheck=view.findViewById(R.id.btncheck);

      btncheck.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

          }
      });
      return view;
    }

    @Override
    public void onClick(View v) {

        int num=Integer.parseInt(etnum.getText().toString());
        int rem,rev=0,x;
        x=num;

        while(num>0){
            rem=num%10;
            rev=num*10+rem;
            num=num/10;
        }
if(rev==x){
    tvmessage.setText("It is a palindrome"+ Integer.toString(num));
}

else{
    tvmessage.setText("it is not a palindrome");
}

    }
}
