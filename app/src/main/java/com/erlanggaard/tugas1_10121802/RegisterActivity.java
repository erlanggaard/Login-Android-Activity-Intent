package com.erlanggaard.tugas1_10121802;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    /*
    Tgl Pengerjaan : 21 April 2022
    NIM : 10121802
    Nama : Erlangga Ardiansyah R
    Kelas : IF-3
    */

    TextView text_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        text_signin = findViewById(R.id.text_signin);

        text_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
            }
        });
    }
}