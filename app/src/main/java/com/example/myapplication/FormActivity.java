package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    String [] empType = {"Select employee type","Permanent","Temporary","Contract","Freelancer"};

    Spinner spinner;

    ArrayAdapter adapter;

    TextView textView,textView2;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        spinner = findViewById(R.id.spinner2);
        button = findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormActivity.this, MainActivity.class);
                finish();
            }
        });
        //initiate Adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,empType);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(FormActivity.this, empType[position], Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        textView.setText(getIntent().getStringExtra("message"));
        textView2.setText(getIntent().getStringExtra("nextMessage"));
    }
}