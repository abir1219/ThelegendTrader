package com.Thelegendtrader.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.Thelegendtrader.app.MainActivity;
import com.Thelegendtrader.app.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {
    ActivitySplashScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new Thread(new Runnable() {
            @Override
            public void run() {
                startProgress();
            }
        }).start();
    }

    private void startProgress() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(50);
                binding.progressbar.setProgress(i);
                if (i == 99) {
                    //Toast.makeText(this, "end", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SplashScreen.this, RedirectActivity.class));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}