package com.example.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.task4.utils.ThemeSelector;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeSelector.changeToRandomTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        TextView fioText = findViewById(R.id.fio);
        fioText.setTextSize(random.nextInt(40));

        findViewById(R.id.changeThemeButton).setOnClickListener(view -> recreate());
    }
}