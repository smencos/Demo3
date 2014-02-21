package com.example.demo1s3.activities;

import com.example.demo1s3.R;
import com.example.demo1s3.R.layout;
import com.example.demo1s3.R.menu;
import com.example.demo1s3.data.ImageAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.GridView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        GridView gridView = (GridView)findViewById(R.id.grid);
        gridView.setAdapter(new ImageAdapter(this));
    }



}
