package com.example.db;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText un, up, cp;
    String username, password, confirmpass;
    Button reg;
    Context c = RegisterActivity.this;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        un = (EditText) findViewById(R.id.editTextTextPersonName);
        up = (EditText) findViewById(R.id.editTextTextPersonName2);
        cp = (EditText) findViewById(R.id.editTextTextPersonName3);
        reg = (Button) findViewById(R.id.button5);
        reg.setOnClickListener((v) -> {
            username = un.getText().toString();
            password = up.getText().toString();
            confirmpass = cp.getText().toString();
            if (!(password.equals(confirmpass))) {
                Toast.makeText(getBaseContext(), "password not matching !!!", Toast.LENGTH_LONG).show();
                up.setText("");
                cp.setText("");
            } else {
                dbOperation db = new dbOperation(c);
                db.putInformation(db, username, password);
                Toast.makeText(getBaseContext(), "Register Completed", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }}
