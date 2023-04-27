package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button buttonBack;
    EditText editTextBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView5);
        TextView textView2 = findViewById(R.id.textView6);

        textView.setText(getIntent().getStringExtra("message"));
        textView2.setText(getIntent().getStringExtra("nextMessage"));

        buttonBack = findViewById(R.id.button3);
        editTextBack = findViewById(R.id.editTextBack);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("key", editTextBack.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
