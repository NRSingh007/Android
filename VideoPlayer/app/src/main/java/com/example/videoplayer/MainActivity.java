package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // to get the reference to the video view
        // "findViewById()", is use in order to get the reference
        final VideoView myVideoView = (VideoView) findViewById(R.id.myVideoView);
        myVideoView.setVideoPath("https://youtu.be/kJ17YVyilUc?t=194");
        myVideoView.start();

        // in order to run the internet we have to give permission in Manifests
        // <uses-permission android:name="android.permission.INTERNET"/>
    }
}