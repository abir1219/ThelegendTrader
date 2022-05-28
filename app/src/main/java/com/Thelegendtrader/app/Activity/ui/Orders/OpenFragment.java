package com.Thelegendtrader.app.Activity.ui.Orders;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Thelegendtrader.app.R;
import com.Thelegendtrader.app.databinding.FragmentOpenBinding;

public class OpenFragment extends Fragment {
    FragmentOpenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentOpenBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }
}