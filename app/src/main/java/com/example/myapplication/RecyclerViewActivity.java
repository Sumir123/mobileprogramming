package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerItemsDTO[] recyclerItemsDTOS = new RecyclerItemsDTO[]{
                new RecyclerItemsDTO("java", R.drawable.java),
                new RecyclerItemsDTO("Android", R.drawable.android),
                new RecyclerItemsDTO("Swift", R.drawable.swift),
                new RecyclerItemsDTO("Flutter", R.drawable.flutter),
                new RecyclerItemsDTO("React Native", R.drawable.react)
        };
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(recyclerItemsDTOS);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}