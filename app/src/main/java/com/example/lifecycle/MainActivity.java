package com.example.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text1);
        Log.d("Lifecycle", "onCreate");
        text1.append("\n"+"onCreate");
        if (savedInstanceState == null){
            Log.d("Lifecycle", "NODATA");
        }

    }
    @Override
    protected void onSaveInstanceState (@NonNull Bundle onState){
        super.onSaveInstanceState(onState);
        Log.d("Lifecycle", "onSaveInstanceState");
        text1.append("\n"+"onSaveInstanceState");

    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle onState){
        super.onRestoreInstanceState(onState);
        Log.d("Lifecycle", "onRestoreInstanceState");
        text1.append("\n"+"onRestoreInstanceState");
    }
    @Override
    protected void onRestart() {

        super.onRestart();
        Log.d("Lifecycle", "onRestart");
        text1.append("\n"+"onRestart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Lifecycle", "onPause");
        text1.append("\n"+"onPause");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Lifecycle", "onResume");
        text1.append("\n"+"onResume");
    }
    @Override
    protected void onPostResume(){
        super.onPostResume();
        Log.d("Lifecycle", "onPostResume");
        text1.append("\n"+"onPostResume");
    }
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        Log.d("Lifecycle", "onPostCreate");
        text1.append("\n"+"onPostCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Lifecycle", "onStart");
        text1.append("\n"+"onStart");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Lifecycle", "onStop");
        text1.append("\n"+"onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy");
        text1.append("\n"+"onDestroy");
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        Log.d("Lifecycle", "onKeyDown"+keyCode);
        if (keyCode == KeyEvent.KEYCODE_SPACE){
            Log.d("Lifecycle", "space");
        }
        event.startTracking();
        return true;
    }
    @Override
    public boolean onKeyLongPress(int keyCode,KeyEvent event){
        Log.d("Lifecycle", "onKeyLongPressed"+keyCode);
        return super.onKeyLongPress(keyCode, event);
    }
    @Override
    public void onBackPressed(){
        Log.d("Lifecycle", "onBackPressed");
        super.onBackPressed();
    }

}