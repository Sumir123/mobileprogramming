package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GridExampleActivity extends AppCompatActivity {

    String[] programmingLang = {"Java", "Android", "Swift", "Flutter", "React"};

    int[] images = {R.drawable.java, R.drawable.android, R.drawable.swift, R.drawable.flutter, R.drawable.react};

    GridView gridView;

    GirdViewAdapter girdViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_example);
        gridView = findViewById(R.id.newGridView);
        girdViewAdapter = new GirdViewAdapter(GridExampleActivity.this, programmingLang, images);
        gridView.setAdapter(girdViewAdapter);
    }
}