package com.togettech.kmerdelices.ui;

import android.content.Intent;
import android.os.Bundle;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.togettech.kmerdelices.R;
import com.togettech.kmerdelices.ui.home.HomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {


    @BindView(R.id.splash)
    TextView splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.transition);
        splash.startAnimation(animation);
        final Intent intent = new Intent(this, HomeActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}
