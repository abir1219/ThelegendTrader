package com.Thelegendtrader.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Thelegendtrader.app.R;
import com.Thelegendtrader.app.databinding.ActivityRedirectBinding;

public class RedirectActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityRedirectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRedirectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnClick();
    }

    private void btnClick() {
        binding.rl1.setOnClickListener(this);
        binding.rl2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rl1:
                startActivity(new Intent(RedirectActivity.this,LoginActivity.class));
                break;
        }
    }
}