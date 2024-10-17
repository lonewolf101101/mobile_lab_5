package com.example.lab_5;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String msg = "Android : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_first;
        btn_first = (Button) findViewById(R.id.button);
        Log.d(msg, "The onCreate() event");
        btn_first.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i0 = new Intent(getApplicationContext(), task_2.class);
                startActivity(i0);
            }
        });
        Button btn_second = (Button) findViewById(R.id.button2);
        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i0 = new Intent(getApplicationContext(), task_3.class);
                startActivity(i0);
            }
        });
        Button btn_third = (Button) findViewById(R.id.button3);
        btn_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i0 = new Intent(getApplicationContext(), task_1.class);
                startActivity(i0);
            }
        });
        Button btn_fourth = (Button) findViewById(R.id.button4);
        btn_fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i0 = new Intent(getApplicationContext(), task_4.class);
                startActivity(i0);
            }
        });
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }
}


