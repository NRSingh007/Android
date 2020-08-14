package com.example.hello_worldapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;        // importing this "Log" in order to access the Log the output message
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    //MainActivity is inheriting some properties from the AppCompatActivity
    // creating string with name "TAG"
    private static final String TAG="MyMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {        // onCreate is loading up the content on this appllication
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // printing out the log information with two parameter, 1st param is String and 2nd param is the Activity_State i.e., onCreate
        Log.i(TAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState");
    }


    //    public void sendMessage(View view){
//
//    }
}