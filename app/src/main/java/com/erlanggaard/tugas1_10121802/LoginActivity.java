package com.erlanggaard.tugas1_10121802;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    /*
    Tgl Pengerjaan : 21 April 2022
    NIM : 10121802
    Nama : Erlangga Ardiansyah R
    Kelas : IF-3
    */

    EditText edt_username, edt_password;
    Button button_login;
    TextView button_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_username = findViewById(R.id.edt_username);
        edt_password = findViewById(R.id.edt_password);
        button_login = findViewById(R.id.button_login);
        button_signup = findViewById(R.id.text_signup);



        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameInput = edt_username.getText().toString();
                String passwordInput = edt_password.getText().toString();

                if (usernameInput.equals("erlangga")&& passwordInput.equals("10121802")){
                    Toast.makeText(getApplicationContext(), "Selamat Datang",
                            Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                    finish();
                } else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Username atau Password salah!").
                            setNegativeButton("Retry", null).create().show();
                }
            }
        });

        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                finish();
            }
        });



    }
}