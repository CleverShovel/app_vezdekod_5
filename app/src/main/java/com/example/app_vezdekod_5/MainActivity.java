package com.example.app_vezdekod_5;

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

    public void onCreateFundClick(View v) {
        Intent intent = new Intent(MainActivity.this,
                ChooseFundingType.class);
        startActivity(intent);
    }
}