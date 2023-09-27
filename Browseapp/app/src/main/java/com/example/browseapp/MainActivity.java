package com.example.browseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onshow(View v){
        EditText e=(EditText) findViewById(R.id.e1);
        String url=e.getText().toString();
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
    public void onsearch(View v){
        EditText e=(EditText) findViewById(R.id.e2);
        String url="https://www.google.com/search?q=" + e.getText().toString();
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}