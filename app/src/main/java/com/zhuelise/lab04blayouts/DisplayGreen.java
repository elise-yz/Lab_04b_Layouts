package com.zhuelise.lab04blayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisplayGreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_green);
    }

    public void goForwards(View view) {
        Intent intent = new Intent(this, DisplayBlue.class);
        startActivity(intent);
    }

    public void goBackwards(View view) {
        Intent intent = new Intent(this, DisplayYellow.class);
        startActivity(intent);
    }
}