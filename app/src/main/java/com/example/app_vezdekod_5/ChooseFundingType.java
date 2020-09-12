package com.example.app_vezdekod_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChooseFundingType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_funding_type);
    }

    public void onCreateGoalFundClick(View v) {
        Intent intent = new Intent(ChooseFundingType.this,
                GoalFund.class);
        startActivity(intent);
    }
}