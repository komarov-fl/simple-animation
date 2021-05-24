package com.kda_kka_apps.simple_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class LauncherActivity extends AppCompatActivity {

    private Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher_main);

        ImageView image = findViewById(R.id.imageView);
        AnimatedVectorDrawable animation = (AnimatedVectorDrawable) image.getDrawable();
        animation.start();

        mTimer = new Timer();
        LauncherActivity context = this;

        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(context, MainActivity.class));
            }
        }, 2000);
    }
}