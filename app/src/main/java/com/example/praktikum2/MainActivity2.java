package com.example.praktikum2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    //Mendeklarasikan variable dengan tipe data textview
    TextView txEmail, txPass;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Menghubungkan variable txEmail dengan componen textview pada layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan variable txPass dengan componen textview pada layout
        txPass = findViewById(R.id.tvPassword);

        //Membuat object bundle dan mengambil data yang dikirimkan activity sebelumnya
        Bundle btr = getIntent().getExtras();

        //Membuat variable string untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya  dengan kunci "gpx"
        String email = btr.getString("gpx");

        //Membuat variable string untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya  dengan kunci "btr"
        String password = btr.getString("btr");

        //Menampilkan value dari variable email kedalam txEmail
        txEmail.setText(email);

        //Menampilkan value dari variable password kedalam txEmail
        txPass.setText(password);




    }
}