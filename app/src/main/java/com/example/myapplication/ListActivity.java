package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    String[] programmingLang = {"Java", "Android",  "Swift", "Flutter", "React"};

    int [] images ={R.drawable.java,R.drawable.android,R.drawable.swift,R.drawable.flutter,R.drawable.react};

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.newListView);

        //Array adapter used for displaying single text UI in list item

//        adapter = new ArrayAdapter(ListActivity.this, android.R.layout.simple_list_item_1, programmingLang);
//
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(ListActivity.this, "Item clicked "+programmingLang[i], Toast.LENGTH_SHORT).show();
//            }
//        });

        //Base adapter for displaying ui elements in list items
        CustomListViewAdapter customListViewAdapter = new CustomListViewAdapter(ListActivity.this,programmingLang,images);
        listView.setAdapter(customListViewAdapter);
    }
}