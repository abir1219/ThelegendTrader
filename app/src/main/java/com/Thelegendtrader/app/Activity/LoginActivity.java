package com.Thelegendtrader.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Thelegendtrader.app.R;
import com.Thelegendtrader.app.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BtnClick();
    }

    private void BtnClick() {
        binding.ivBack.setOnClickListener(this);
        binding.tvLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.ivBack:
                onBackPressed();
                break;
            case R.id.tvLogin:
                startActivity(new Intent(LoginActivity.this,VerifyPinActivity.class));
                break;
        }
    }
}