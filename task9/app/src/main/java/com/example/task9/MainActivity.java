package com.example.task9;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text1);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.contextmenu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.color_red) {
            TextView textView = (TextView) findViewById(R.id.text1);
            textView.setTextColor(Color.parseColor("red"));
        }
        if (id == R.id.color_black) {
            TextView textView = (TextView) findViewById(R.id.text1);
            textView.setTextColor(Color.parseColor("black"));
        }

        return super.onContextItemSelected(item);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.show_text:
                if (item.isChecked()) {
                    TextView textView = findViewById(R.id.text1);
                    textView.setVisibility(TextView.VISIBLE);
                    item.setChecked(false);
                } else {
                    TextView textView = findViewById(R.id.text1);
                    textView.setVisibility(TextView.INVISIBLE);
                    item.setChecked(true);
                }
                break;

            case R.id.spin_head:
                ImageView headImage = findViewById(R.id.androidHead);
                headImage.setRotation(headImage.getRotation() + 90);
                break;

            case R.id.aboutProgram:
                Toast.makeText(MainActivity.this, R.string.fio, Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

}