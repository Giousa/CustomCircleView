package com.zmm.customcircleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomView customView = (CustomView) findViewById(R.id.custom_view);

        customView.setAngleOne(270f);
    }
}
