package com.ringdroid.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ringdroid.RingdroidSelectActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, RingdroidSelectActivity.class);
        intent.setAction(Intent.ACTION_MAIN);
        startActivity(intent);
    }
}
