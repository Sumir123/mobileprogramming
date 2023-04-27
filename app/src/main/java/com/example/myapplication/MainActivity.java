package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String [] data = {"Java","C","JavaScript","Swift","Kotlin"};
    Spinner spinner;
    ArrayAdapter adapter;

    TextView textViewBack;
    Button button, button2;
    EditText editText, editText2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "on Create method calling", Toast.LENGTH_SHORT).show();

        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        editText = findViewById(R.id.editOne);
        editText2 = findViewById(R.id.editTwo);
        textViewBack = findViewById(R.id.textViewBack);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FormActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("message", editText.getText().toString());
                intent.putExtra("nextMessage", editText2.getText().toString());
                startActivityForResult(intent, 2);
                startActivity(intent);
            }
        });

        //initiate Adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,data);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, data[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 2 ) {
            String text = data.getStringExtra("key");
            TextView textViewBack = findViewById(R.id.textViewBack);
            Log.d("TAG", "onActivityResult: "+ textViewBack);
            textViewBack.setText(text);
        }
    }
}
