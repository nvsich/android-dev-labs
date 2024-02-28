package com.example.task10;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random random = new Random();

    private List<String> texts = Arrays.asList(
            "Вы действительно хотите выйти?",
            "Вы действительно хотите выйти?",
            "Вы серьёзно собираетесь выйти?",
            "Вы действительно хотите завершить сеанс?",
            "Вы уверены, что хотите покинуть приложение?",
            "Вы действительно хотите выйти из приложения?",
            "Вы уверены, что хотите закончить сеанс?",
            "Вы действительно хотите закрыть приложение?",
            "Вы уверены, что хотите выйти?",
            "Вы действительно хотите покинуть приложение?",
            "Вы действительно хотите покинуть приложение?"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        Button button2 = findViewById(R.id.button2);

        button.setOnClickListener(view -> showNestedDialog(MainActivity.this));

        button2.setOnClickListener(v -> MainActivity.this.finish());
    }

    public void showNestedDialog(Context context) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setMessage(texts.get(random.nextInt(texts.size())));
        dialog.setCancelable(false);
        dialog.setPositiveButton("Да", (dialogInterface, which) -> showNestedDialog(context));
        dialog.setNegativeButton("Нет", (dialogInterface, which) -> dialogInterface.cancel());
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
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
                                    "диалогового окна\r\n\n Автор - Наконечный Виктор " +
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