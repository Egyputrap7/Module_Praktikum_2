package com.example.praktikum2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edEmail , edPassword;

    String nama,password;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pendaftaran, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mnDaftar) {
            Intent i = new Intent(MainActivity.this, Daftaractivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignin);

        edEmail=findViewById(R.id.edEmail);

        edPassword=findViewById(R.id.edPassword);

        //Membuat fungsi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext password kedalam variable nama
                nama = edEmail.getText().toString();

                //menyimpan input user di edittext password kedalam variable password
                password =edPassword.getText().toString();

                //mengeset email yang benar
                String email = "admin";

                //mengeset password yangg benar
                String pass = "admin";

                //Menegecek apakah isi dari email dan password sesuai dengan yang sudah di set
                if (nama.isEmpty() || password.isEmpty()){

                    //Memebuat variable toast dengan pesan "Tidak boleh kosong"
                    Toast rrq = Toast.makeText(getApplicationContext(),
                            "Email dan password Wajib di isi",Toast.LENGTH_LONG);
                    //Menampilkan toast
                    rrq.show();
                }
                else {
                    //Mengecek apakah isi dari email dan password sesuai dengan yang sudah di set

                    //Memebuat variable toast dengan pesan "Login sukses"
                    if (nama.equals(email) && password.equals(pass)) {
                        Toast rrq = Toast.makeText(getApplicationContext(),
                                "login sukses", Toast.LENGTH_LONG);
                        //Menampilkan toast
                        rrq.show();

                        //Membuat object intent untuk berpindah activity dari Mainactivity ke Mainactivity2
                        Intent MU = new Intent(MainActivity.this,MainActivity2.class);

                        //Memasukan value  dari variable nama dengan kunci "gpx"
                        //dan dimasukan kedalam intent
                        MU.putExtra("gpx",nama);

                        //Memasukan value  dari variable password dengan kunci "btr"
                        //dan dimasukan kedalam intent
                        MU.putExtra("btr",password);

                        //Membuat object bundel//
                        //Bundle evos = new Bundle();

                        //Memasukan value  dari variable nama dengan kunci "gpx"
                        //dan dimasukan kedalam bundle
                        //evos.putString("gpx", nama.trim());

                        //Memasukan value  dari variable password dengan kunci "btr"
                        //dan dimasukan kedalam bundle
                       // evos.putString("btr", password.trim());

                        //Membuat object intent untuk berpindah activity dari Mainactivity ke Mainactivity2
                        //Intent MU = new Intent(getApplicationContext(), MainActivity2.class );

                        //Memasukan bundle kedalam intent untuk dikirim ke Mainactivity2
                        //MU.putExtras(evos);

                        //Berpindah ke Mainactivity2
                        startActivity(MU);
                    }else{

                        //Memebuat variable toast dengan pesan "Login gagal"
                        Toast rrq = Toast.makeText(getApplicationContext(),"Login gagal", Toast.LENGTH_LONG);
                        //Menampilkan toast
                        rrq.show();
                    }
                }

                Toast t =Toast.makeText(getApplicationContext(),
                        "email anda "+ nama + " dan password anda " +password+"",Toast.LENGTH_LONG);

                t.show();
            }

        });
    }
}