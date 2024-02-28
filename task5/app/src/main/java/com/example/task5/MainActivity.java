package com.example.task5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task5.adapter.TweetAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> tweetTexts = new ArrayList<>();
    private ArrayList<Integer> tweetImages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        setData();

        TweetAdapter adapter = new TweetAdapter(this, tweetTexts, tweetImages);
        recyclerView.setAdapter(adapter);

    }

    private void setData() {
        tweetTexts.add("Наконечный Виктор\nСергеевич, БПИ223");
        tweetImages.add(R.drawable.image0);

        tweetTexts.add("Ель");
        tweetImages.add(R.drawable.image1);

        tweetTexts.add("Кедр");
        tweetImages.add(R.drawable.image2);

        tweetTexts.add("Сосна");
        tweetImages.add(R.drawable.image3);

        tweetTexts.add("Туя");
        tweetImages.add(R.drawable.image4);

        tweetTexts.add("Тис");
        tweetImages.add(R.drawable.image5);

        tweetTexts.add("Кипарис");
        tweetImages.add(R.drawable.image6);
    }
}