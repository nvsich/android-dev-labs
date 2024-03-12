package com.example.task13;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView2);

        videoView.setVideoURI(Uri.parse("android.resource://" +
                getPackageName() + "/" + R.raw.johny_cash_hurt));

        videoView.setMediaController(new MediaController(this));
        videoView.start();
        videoView.requestFocus();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.aboutProgram:
                AlertDialog.Builder dialog = new
                        AlertDialog.Builder(MainActivity.this);
                try {
                    dialog.setMessage(
                            getTitle().toString() + " версия " + getPackageManager()
                                    .getPackageInfo(getPackageName(), 0)
                                    .versionName + "\r\n\nПрограмма с примером выполнения " +
                                    "запуска видео\r\n\n Автор - Наконечный Виктор " +
                                    "Сергеевич, БПИ223");
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
                dialog.setTitle("О программе");
                dialog.setNeutralButton("OK", (dialog1, which) -> dialog1.dismiss());
                dialog.setIcon(R.mipmap.ic_launcher_round);
                AlertDialog alertDialog = dialog.create();
                alertDialog.show();
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