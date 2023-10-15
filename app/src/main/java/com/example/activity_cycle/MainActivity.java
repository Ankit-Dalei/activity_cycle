package com.example.activity_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
public static final String sandy="hello";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(sandy, "onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(sandy, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(sandy, "onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(sandy, "onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(sandy, "onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(sandy, "onRestart()");
    }
}