package com.Thelegendtrader.app.Activity.ui.Tools;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Thelegendtrader.app.R;
import com.Thelegendtrader.app.databinding.FragmentBusketsBinding;

public class BasketsFragment extends Fragment {
    FragmentBusketsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentBusketsBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}