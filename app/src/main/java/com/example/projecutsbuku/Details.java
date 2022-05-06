package com.example.projecutsbuku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    TextView storyContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        storyContent = findViewById(R.id.contentOfStory);
        Intent i = getIntent();
        String title = i.getStringExtra("titleOfStory");
        String content = i.getStringExtra("contentOfStory");

        //set the appbar title
        getSupportActionBar().setTitle(title);

        //set content of the story
        storyContent.setText(content);

        storyContent.setMovementMethod(new ScrollingMovementMethod());


    }
}