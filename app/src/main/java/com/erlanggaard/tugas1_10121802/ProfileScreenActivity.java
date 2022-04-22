package com.erlanggaard.tugas1_10121802;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileScreenActivity extends AppCompatActivity {

    /*
    Tgl Pengerjaan : 21 April 2022
    NIM : 10121802
    Nama : Erlangga Ardiansyah R
    Kelas : IF-3
    */

    ImageView ic_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);

        ic_back = findViewById(R.id.ic_back);

        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileScreenActivity.this, HomeActivity.class));
                finish();
            }
        });
    }
}