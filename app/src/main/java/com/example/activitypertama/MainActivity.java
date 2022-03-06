package com.example.activitypertama;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variable untuk button
    Button btnLogin;

    //Deklarasi variable untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada layout
        edemail = findViewById(R.id.edEmail);

        //menghubungkan variable edpassword dengan componen button pada layout
        edpassword = findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan inputt user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //membuat variabel toast dan membuaat toast dengan menambahkan variabel nama dan password
                Toast t = Toast.makeText(getApplicationContext(), "email anda: " + nama + " dan Password anda: " + password + "", Toast.LENGTH_LONG);

                //menampilkan toast
                t.show();

                //membuat fungsi permisalan
                    //Login berhasil
                    if
                    (nama.equals("m.irsyad@gmail.com") && password.equals("irsyad123")) {
                        Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG).show();

                    }
                    //Email Salah
                    else if (password.equals("irsyad123")) {
                        //jika Email salah
                        Toast.makeText(getApplicationContext(), "Email salah", Toast.LENGTH_LONG).show();

                    }
                    //Password Salah
                    else if (nama.equals("m.irsyad@gmail.com")) {
                        //jika Password salah
                        Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();

                    }
                    //Email dan Password Salah
                    else {
                        //jika email dan password salah
                        Toast.makeText(getApplicationContext(), "Email dan Password Salah", Toast.LENGTH_LONG).show();
                    }
                }
            });
    }
}