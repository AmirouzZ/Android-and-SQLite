package com.example.db;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button login, register, update, delete;
String status = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.button);
        register = (Button) findViewById(R.id.button2);
        update = (Button) findViewById(R.id.button3);
        delete = (Button) findViewById(R.id.button4);
        register.setOnClickListener((arg0) -> {
            Intent i1 = new Intent(MainActivity.this, RegisterActivity.class);
                    startActivity(i1);
        });

//        login.setOnClickListener((arg0) -> {
//            status = "2";
//            Intent i2 = new Intent(MainActivity.this, LoginActivity.class);
//            i2.putExtra("status", status);
//            startActivity(i2);
//        });
    }
}