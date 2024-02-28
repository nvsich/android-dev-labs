package com.example.task3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.task2.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView output = findViewById(R.id.acitivity2output);
        output.setText(getIntent().getStringExtra("output_text"));
        output.setTextColor(getIntent().getBooleanExtra(
                "is_empty_input", true)
                ? Color.RED
                : Color.GREEN
        );

        Button button = findViewById(R.id.acitivity2button);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }
}