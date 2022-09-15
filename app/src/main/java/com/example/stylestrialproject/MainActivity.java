package com.example.stylestrialproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchScreens(View view){
        Intent intent = new Intent(this, SwipeActivity.class);
        startActivity(intent);
        overridePendingTransition(R.drawable.slide_in_left, R.drawable.slide_out_right);
    }
}