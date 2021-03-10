package com.example.pertemuan3_mobile_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void articlePage(View view) {
        Intent backAction = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(backAction);
    }

    public void backHome(View view) {
        Intent backAction = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(backAction);
    }
}