package com.example.activitypertama;

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

                String email="irsyad";
                String password="1234";

                //membuat fungsi permisalan
                    //Login berhasil
                    if
                    (nama.equals(email) && password.equals(password)) {
                        Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG).show();
                        Bundle b = new Bundle();
                        b.putString("a",nama.trim());
                        b.putString("b",password.trim());
                        Intent i = new Intent(getApplicationContext(),Home_Activity.class);
                        i.putExtras(b);
                        startActivity(i);
                    }
                    else if (nama.isEmpty()||password.isEmpty()){
                        Toast.makeText(getApplicationContext(),"Email dan Password tidak boleh kosong",Toast.LENGTH_LONG).show();
                    }
                    //Email Salah
                    else if (password.equals(password)) {
                        //jika Email salah
                        Toast.makeText(getApplicationContext(), "Email salah", Toast.LENGTH_LONG).show();

                    }
                    //Password Salah
                    else if (nama.equals(email)) {
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Method untuk menampilkan menu
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.mnDaftar)
        {
            //Method untuk memanggil activity "MenuActivity"
            Intent i = new Intent(getApplicationContext(),MenuActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}