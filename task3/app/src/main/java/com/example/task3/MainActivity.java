package com.example.task3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.task2.R;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputField = findViewById(R.id.activity1InputField);
        Button button = findViewById(R.id.activity1Button);

        button.setOnClickListener(view -> {
            String input = inputField.getText().toString();
            String outputText;

            outputText = input.isEmpty()
                    ? "Your input is empty. Try again!"
                    : "Your input: " + input;

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("output_text", outputText);
            intent.putExtra("is_empty_input", input.isEmpty());
            startActivity(intent);
        });
    }
}