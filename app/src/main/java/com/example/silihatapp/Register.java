package com.example.silihatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Database_Helper mydb;

    Button b1;
    EditText e1, e2, e3;
    String username, password;

    public Register() {
        mydb = new Database_Helper(Register.this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        b1 = (Button) findViewById(R.id.b1);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Clickinsert();
            }
        });

    }

    private void Clickinsert() {
        String username = e1.getText().toString();
        String password = e2.getText().toString();

        if (username.equals(null) == true || username.equals("") == true || password.equals(null) == true || password.equals("") == true) {
            Toast.makeText(Register.this, "Data insertion failed", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(Register.this, "Data inserted sucessfully", Toast.LENGTH_SHORT).show();
        }
    }
}

