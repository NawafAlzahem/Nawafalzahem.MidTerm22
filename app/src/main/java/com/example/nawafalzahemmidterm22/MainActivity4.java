package com.example.nawafalzahemmidterm22;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().hide();
        TimerTask task= new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity4.this,MainActivity.class));
                finish();
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,9000);
    }
}
