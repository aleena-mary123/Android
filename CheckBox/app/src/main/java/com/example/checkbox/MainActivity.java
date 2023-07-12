package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    EditText e1;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox) findViewById(R.id.c1);
        c2=(CheckBox) findViewById(R.id.c2);
        c3=(CheckBox) findViewById(R.id.c3);
        e1=(EditText) findViewById(R.id.e1);
    }
    public void onug(View v)
    {
        if(c3.isChecked())
        {
            c1.setChecked(true);
            c2.setChecked(true);
            str="SSLC PlUSTWO UG ";

        }
        else
        {
            str="SSLC PLUSTWO";

        }
        e1.setText(str);
    }
    public void plustwo(View v)
    {
        if(c2.isChecked())
        {
            c1.setChecked(true);
            str="SSLC PLUSTWO";
        }
        else
        {
            c3.setChecked(false);
            str="SSLC";
        }
        e1.setText(str);
    }

    public void sslc(View v)
    {
        String str;
        if(c1.isChecked())
        {
            str="SSLC";
        }
        else
        {
            c2.setChecked(false);
            c3.setChecked(false);
            str="";
        }
        e1.setText(str);
    }
}

