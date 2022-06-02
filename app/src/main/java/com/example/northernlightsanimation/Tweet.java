    package com.example.northernlightsanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

    public class Tweet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet);
        ImageView imgRotate = (ImageView) findViewById(R.id.imgTweet);
        imgRotate.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate));
    }
}