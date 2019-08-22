package com.wazinsure.recyclerviewitemanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView NewsRecyclerView;
    NewsAdapter newsAdapter;
    List<NewsItem> mData;
    FloatingActionButton fabSwitcher;
    boolean isDark =false;
    ConstraintLayout rootLayout;
    EditText searchInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // let's make this activity on full screen

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        // hide the action bar

        getSupportActionBar().hide();



        // ini view

        fabSwitcher = findViewById(R.id.fab_switcher);
        rootLayout = findViewById(R.id.root_layout);
        searchInput = findViewById(R.id.search_input);

        NewsRecyclerView = findViewById(R.id.news_rv);
        mData = new ArrayList<>();

        // load theme state

        isDark = getThemeStatePref();
        if(isDark) {
            // dark theme is on
            rootLayout.setBackgroundColor(getResources().getColor(R.color.black));
            searchInput.setBackgroundResource(R.drawable.search_input_dark_style);
        }
        else
        {
            // light theme is on
            searchInput.setBackgroundResource(R.drawable.search_input_style);
            rootLayout.setBackgroundColor(getResources().getColor(R.color.white));
        }








        mData.add(new NewsItem("Android Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage1));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("Flutter Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("Xamarin Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("C# Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("Engineer Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("Web Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("Blockchain Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("Lead Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("Test Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));
        mData.add(new NewsItem("IOS Dev", "Ultricies leo integer malesuada nunc. Nunc sed velit dignissim sodales ut. Sodales ut etiam sit amet nisl. Feugiat nisl pretium fusce id velit ut. Risus feugiat in ante metus. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Quis eleifend quam adipiscing vitae", "6th July 2019", R.drawable.testimage2));




        //adapter init
        newsAdapter = new NewsAdapter(this ,mData,isDark);
        NewsRecyclerView.setAdapter(newsAdapter);
        NewsRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        fabSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isDark =!isDark;
                if(isDark){
                    rootLayout.setBackgroundColor(getResources().getColor(R.color.black));
                    searchInput.setBackgroundResource(R.drawable.search_input_dark_style);
                }
                else{
                    rootLayout.setBackgroundColor(getResources().getColor(R.color.white));
                    searchInput.setBackgroundResource(R.drawable.search_input_style);
                }
                newsAdapter = new NewsAdapter(getApplicationContext(),mData,isDark);
                NewsRecyclerView.setAdapter(newsAdapter);
                saveThemeStatePref(isDark);
            }
        });

        searchInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {

                newsAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    private void saveThemeStatePref(boolean isDark) {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPref",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isDark",isDark);
        editor.commit();
    }

    private boolean getThemeStatePref () {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPref",MODE_PRIVATE);
        boolean isDark = pref.getBoolean("isDark",false) ;
        return isDark;

    }



}
