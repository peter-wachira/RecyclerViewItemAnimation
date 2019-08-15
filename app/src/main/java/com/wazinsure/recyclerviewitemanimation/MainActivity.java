package com.wazinsure.recyclerviewitemanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

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




        mData.add(new NewsItem("Android Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage1));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("Android Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage1));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));




        newsAdapter = new NewsAdapter(this ,mData);
        NewsRecyclerView.setAdapter(newsAdapter);
        NewsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }




}
