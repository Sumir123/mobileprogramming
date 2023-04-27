package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TaskActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        TextView NameTextView = findViewById(R.id.textViewName);
        TextView AddressTextView = findViewById(R.id.textViewAddress);
        TextView EmailTextView = findViewById(R.id.textViewEmail);
        TextView MobileNumTextView = findViewById(R.id.textViewMobileNum);
        TextView EmpTypeTextView = findViewById(R.id.textViewEmployeeType);

        NameTextView.setText("Name: "+getIntent().getStringExtra("name"));
        AddressTextView.setText("Address: "+getIntent().getStringExtra("address"));
        EmailTextView.setText("Email: "+getIntent().getStringExtra("email"));
        MobileNumTextView.setText("Mobile Number: "+getIntent().getStringExtra("mobileNum"));
        EmpTypeTextView.setText("Employee Type: "+getIntent().getStringExtra("employeeType"));


    }
}