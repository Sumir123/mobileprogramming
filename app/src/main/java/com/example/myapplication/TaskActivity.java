package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TaskActivity extends AppCompatActivity {
 String SpinnerData[] ={"Freelancer","Full Time","Contract"};

    Spinner spinner3;

    ArrayAdapter adapter1;

    Button button;

    EditText editTextName,editTextAddress,editTextEmail,editTextMobileNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        spinner3 = findViewById(R.id.spinner3);
        button = findViewById(R.id.button4);

        editTextName = findViewById(R.id.editTextName);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextMobileNum = findViewById(R.id.editTextNumber);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TaskActivity.this,TaskActivity2.class);

                intent.putExtra("name",editTextName.getText().toString());
                intent.putExtra("address",editTextAddress.getText().toString());
                intent.putExtra("email",editTextEmail.getText().toString());
                intent.putExtra("mobileNum",editTextMobileNum.getText().toString());
                intent.putExtra("employeeType",spinner3.getSelectedItem().toString());
                startActivity(intent);
            }
        });


        adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,SpinnerData);
        spinner3.setAdapter(adapter1);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(TaskActivity.this, SpinnerData[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}