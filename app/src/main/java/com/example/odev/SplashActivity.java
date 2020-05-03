package com.example.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private ImageView imgLogo;
    private static int Gecis_Suresi = 4000; // 4 Saniye
    private TextView txtHosgeldiniz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imgLogo = findViewById(R.id.imgLogo);
        txtHosgeldiniz = findViewById(R.id.ac_splash_hosgeldiniz);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        imgLogo.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(gecis);
                finish();
            }
        },Gecis_Suresi);
        txtHosgeldiniz.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(gecis);
                finish();
            }
        },Gecis_Suresi);

    }
}
