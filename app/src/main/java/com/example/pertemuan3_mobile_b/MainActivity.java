package com.example.pertemuan3_mobile_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void articlePage(View view) {
        Intent backAction = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(backAction);
    }
    public void profilePage(View view) {
        Intent action = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(action);
    }
}