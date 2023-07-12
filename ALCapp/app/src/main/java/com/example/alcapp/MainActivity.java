package com.example.alcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ALCApp","OnCreate()");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d("ALCApp","OnStart()");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("ALCApp","OnStop()");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("ALCApp","OnDestroy()");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("ALCApp","OnResume()");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("ALCApp","OnPause()");
    }
}