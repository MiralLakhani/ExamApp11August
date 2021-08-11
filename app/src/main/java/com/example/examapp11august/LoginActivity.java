package com.example.examapp11august;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsername, edtPwd;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsername=findViewById(R.id.edtUsername);
        edtPwd=findViewById(R.id.edtPwd);
        btnLogin=findViewById(R.id.btnLogIn);

        btnLogin.setOnClickListener(v ->{
            if (edtUsername.getText().toString().isEmpty()){
                Toast.makeText(this, "Please enter the name.", Toast.LENGTH_SHORT).show();
            }else if(edtPwd.getText().toString().isEmpty()){
                Toast.makeText(this, "Please enter the Password.", Toast.LENGTH_SHORT).show();
            }else{
                String name = edtUsername.getText().toString();
                String pwd = edtPwd.getText().toString();
                if(name.equals("user1") && pwd.equals("password1")){

                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(this, "You have logged in.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Please provide a valis Username and Password", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}