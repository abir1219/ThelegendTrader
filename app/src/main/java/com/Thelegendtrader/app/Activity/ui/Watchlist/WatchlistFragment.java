package com.Thelegendtrader.app.Activity.ui.Watchlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Thelegendtrader.app.databinding.FragmentWatchlistBinding;


public class WatchlistFragment extends Fragment {
    FragmentWatchlistBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentWatchlistBinding.inflate(inflater,container,false);
        loadWatchlist();
        return binding.getRoot();
    }

    private void loadWatchlist() {
        //String url = "";
    }
}