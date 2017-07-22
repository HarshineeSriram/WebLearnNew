package org.beta.android.aakashresearchlabs.test.lessons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.beta.android.aakashresearchlabs.test.ChapterAdapter;
import org.beta.android.aakashresearchlabs.test.ChapterClass;
import org.beta.android.aakashresearchlabs.test.Lesson4.L4C1;
import org.beta.android.aakashresearchlabs.test.Lesson4.L4C2;
import org.beta.android.aakashresearchlabs.test.Lesson4.L4C3;
import org.beta.android.aakashresearchlabs.test.Lesson4.L4C4;
import org.beta.android.aakashresearchlabs.test.Lesson4.L4C5;
import org.beta.android.aakashresearchlabs.test.Lesson4.L4C6;
import org.beta.android.aakashresearchlabs.test.Lesson4.L4C7;
import org.beta.android.aakashresearchlabs.test.R;

import java.util.ArrayList;

public class LessonFourActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ChapterAdapter adapter;
    ArrayList chapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        //Setting the recyclerView to have linearLayout
        recyclerView.setLayoutManager(layoutManager);
        chapterList=new ArrayList();
        chapterList.add(new ChapterClass("CSS basics","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", L4C1.class,"L4"));
        chapterList.add(new ChapterClass("Anatomy of a CSS ruleset","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", L4C2.class,"L4"));
        chapterList.add(new ChapterClass("Selecting multiple elements","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", L4C3.class,"L4"));
        chapterList.add(new ChapterClass("Fonts and text","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", L4C4.class,"L4"));
        chapterList.add(new ChapterClass("Boxes, boxes, it's all about boxes","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", L4C5.class,"L4"));
        chapterList.add(new ChapterClass("Changing the page color","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", L4C6.class,"L4"));
        chapterList.add(new ChapterClass("Conclusion","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", L4C7.class,"L4"));
        adapter = new ChapterAdapter(chapterList,getApplicationContext());
        //Adding adapter to recyclerView
        recyclerView.setAdapter(adapter);

    }
}
