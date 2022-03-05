package com.example.praktikum2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edEmail , edPassword;

    String nama,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignin);

        edEmail=findViewById(R.id.edEmail);

        edPassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edEmail.getText().toString();

                password =edPassword.getText().toString();

                Toast t =Toast.makeText(getApplicationContext(),
                        "email anda "+ nama + " dan password anda " +password+"",Toast.LENGTH_LONG);

                t.show();
            }

        });
    }
}