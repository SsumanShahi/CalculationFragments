package com.example.calculationfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private Button btncheckpalindrome;
    private Button btnadd;
    private Button btnarea;
    private Button btnreversenum;
    private Button btnautomorphic;
    private Button btnreversestring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       btnadd=findViewById(R.id.btnsum);
       btnarea=findViewById(R.id.btnarea);
       btnreversenum=findViewById(R.id.btnreversenum);
       btncheckpalindrome=findViewById(R.id.btnpalindrome);
       btnautomorphic=findViewById(R.id.btnautomorphic);
       btnreversestring=findViewById(R.id.btnautomorphic);

       btnadd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });

       btnarea.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });

       btnreversenum.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });

       btncheckpalindrome.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });


       btnautomorphic.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });

       btnreversestring.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });


    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnadd:
                Sumfragment sumFragment = new Sumfragment();
                fragmentTransaction.replace(R.id.fragmentContainer,sumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnarea:
                Areafragment areaFragment = new Areafragment();
                fragmentTransaction.replace(R.id.fragmentContainer,areaFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnreversenum:
                ReverseNumfragment reverseNumFragment = new ReverseNumfragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseNumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnpalindrome:
                Palindromefragment palindromeFragment = new Palindromefragment();
                fragmentTransaction.replace(R.id.fragmentContainer,palindromeFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnautomorphic:
                Automorphicfragment automorphicFragment = new Automorphicfragment();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphicFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnreversestring:
                Reversestringfragment reverseStringFragment = new Reversestringfragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseStringFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

        }
    }
}
