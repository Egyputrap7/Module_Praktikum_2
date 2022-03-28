package com.example.praktikum2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama,tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Indra":
                tvnama.setText("Indra N");
                tvnomor.setText("08143781001");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("08143781001");
            case "Rico":
                tvnama.setText("Rico j");
                tvnomor.setText("08143781001");
            case "Erik":
                tvnama.setText("Erik M");
                tvnomor.setText("08143781001");
            case "Ekik":
                tvnama.setText("Ekik M");
                tvnomor.setText("08143781001");
            case "Azis":
                tvnama.setText("Azis S");
                tvnomor.setText("08143781001");
            case "Egy":
                tvnama.setText("Egy P");
                tvnomor.setText("08143781001");
            case "Akbar":
                tvnama.setText("Akbar R");
                tvnomor.setText("08143781001");
            case "Opal":
                tvnama.setText("Opal M");
                tvnomor.setText("08143781001");
            case "Ican":
                tvnama.setText("Ican L");
                tvnomor.setText("08143781001");
        }
    }
}