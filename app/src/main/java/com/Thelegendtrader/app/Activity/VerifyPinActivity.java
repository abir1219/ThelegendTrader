package com.Thelegendtrader.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Thelegendtrader.app.MainActivity;
import com.Thelegendtrader.app.R;
import com.Thelegendtrader.app.databinding.ActivityVerifyPinBinding;

public class VerifyPinActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityVerifyPinBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerifyPinBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btnClick();
    }

    private void btnClick() {
        binding.ivBack.setOnClickListener(this);
        binding.ivVerify.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.ivBack:
                onBackPressed();
                break;
            case R.id.ivVerify:
                startActivity(new Intent(VerifyPinActivity.this, MainActivity.class));
                break;
        }
    }
}