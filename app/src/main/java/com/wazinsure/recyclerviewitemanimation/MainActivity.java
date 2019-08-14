package com.wazinsure.recyclerviewitemanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView NewsRecyclerView;
    NewsAdapter newsAdapter;
    List<NewsItem> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewsRecyclerView = findViewById(R.id.news_rv);
        mData = new ArrayList<>();

        //fill the list with data

        //proceed from  https://www.youtube.com/watch?v=7qtnkp9pcmw
    }


}
