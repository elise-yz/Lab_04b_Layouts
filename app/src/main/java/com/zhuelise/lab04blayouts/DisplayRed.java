package com.zhuelise.lab04blayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisplayRed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_red);
    }

    public void goForwards(View view) {
        Intent intent = new Intent(this, DisplayOrange.class);
        startActivity(intent);
    }

    public void goBackwards(View view) {
        Intent intent = new Intent(this, DisplayPurple.class);
        startActivity(intent);
    }
}