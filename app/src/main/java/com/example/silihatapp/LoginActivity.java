package com.example.silihatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button b1,b2,b3;
    EditText e1,e2;

    String username ,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(LoginActivity.this,Register.class);
                startActivity(in);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username =e1.getText().toString();
                password =e2.getText().toString();
                if(username.equals(null)==true || username.equals("")==true  || password.equals(null) || password.equals("")==true )
                {
                    Toast.makeText(LoginActivity.this,"required field....",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Intent in = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(in);
                    Toast.makeText(LoginActivity.this,"welcome....",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
