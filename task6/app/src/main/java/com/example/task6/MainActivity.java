package com.example.task6;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation fadeAnimation
                = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_animation);

        final Animation rotateAnimation
                = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotation_anim);

        final Animation scaleAnimation
                = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale_animation);

        Button fadeButton = findViewById(R.id.fadeButton);
        Button rotateButton = findViewById(R.id.rotateButton);
        Button scaleButton = findViewById(R.id.scaleButton);

        TextView fadeText = findViewById(R.id.fioFade);
        TextView rotateText = findViewById(R.id.fioRotate);
        TextView scaleText = findViewById(R.id.fioScale);

        fadeButton.setOnClickListener(v -> fadeText.startAnimation(fadeAnimation));

        rotateButton.setOnClickListener(v -> rotateText.startAnimation(rotateAnimation));

        scaleButton.setOnClickListener(v -> scaleText.startAnimation(scaleAnimation));
    }
}