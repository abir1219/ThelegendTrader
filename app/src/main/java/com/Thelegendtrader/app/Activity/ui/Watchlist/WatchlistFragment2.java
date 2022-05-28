package com.Thelegendtrader.app.Activity.ui.Watchlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Thelegendtrader.app.databinding.FragmentWatchlist2Binding;

public class WatchlistFragment2 extends Fragment {
    FragmentWatchlist2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentWatchlist2Binding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}