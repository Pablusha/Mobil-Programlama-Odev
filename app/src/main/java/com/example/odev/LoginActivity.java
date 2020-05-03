package com.example.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsername;
    EditText edtPassword;
    Button btnGiris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.ac_login_edt_username);
        edtPassword = findViewById(R.id.ac_login_edt_password);
        btnGiris = findViewById(R.id.ac_login_btn_giris);

        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();

                if (username.equals("admin") && password.equals("admin")) {
                    Toast.makeText(LoginActivity.this,"Başarıyla giriş yaptınız.",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
                if (!username.equals("admin") || !password.equals("admin")) {
                    Toast.makeText(LoginActivity.this,"Kullanıcı adınız veya şifreniz yanlış.",Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
