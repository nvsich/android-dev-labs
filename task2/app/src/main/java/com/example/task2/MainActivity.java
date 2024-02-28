package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView inputField = findViewById(R.id.inputField);
        TextView outputField = findViewById(R.id.outputField);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = inputField.getText().toString();
                if (input.isEmpty()) {
                    outputField.setTextColor(Color.RED);
                    outputField.setText("Don't leave field empty!");
                    return;
                }
                outputField.setTextColor(Color.GREEN);
                outputField.setText(inputField.getText().toString());
            }
        });
    }
}