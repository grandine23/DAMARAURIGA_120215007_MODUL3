package com.androidhehe.riga.damarauriga_1202150007_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText mUsername;
    private EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUsername = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);
    }

    public void Login(View view) {
        Intent intent = new Intent(this, MainActivity.class); //merujuk ke kelas MainActivity

        String username = mUsername.getText().toString(); //inisialisai parse si username ke string
        String password = mPassword.getText().toString(); //inisialisai parse si password ke string

        if ((username.equals("EAD")) || (password.equals("MOBILE")) ) { //buat kondisi dengan username dan password yang ditentukan
            Toast toast=Toast.makeText(this, "Selamat Datang", Toast.LENGTH_SHORT); //menampilkan toast jika button di klik
            toast.show();
            startActivity(intent);

        } else {
            Toast toast = Toast.makeText(this, "User Tidak Ditemukan", Toast.LENGTH_SHORT); //nampilin toast jika button diklik tapi belum ada isi
            toast.show();}
    }
}
