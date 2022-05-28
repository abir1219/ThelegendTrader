package com.Thelegendtrader.app.Activity.ui.Watchlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Thelegendtrader.app.Activity.ui.Adapter.ViewPagerAdapter;
import com.Thelegendtrader.app.Activity.ui.Watchlist.WatchlistFragment;
import com.Thelegendtrader.app.Activity.ui.Watchlist.WatchlistFragment2;
import com.Thelegendtrader.app.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false);
        setViewPager();
        return binding.getRoot();
    }

    private void setViewPager() {
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());

        // add your fragments
        adapter.addFrag(new WatchlistFragment(), "Watchlist 1");
        adapter.addFrag(new WatchlistFragment2(), "Watchlist 2");
        adapter.addFrag(new WatchlistFragment2(), "Watchlist 3");
        adapter.addFrag(new WatchlistFragment2(), "Watchlist 4");
        adapter.addFrag(new WatchlistFragment2(), "Watchlist 5");
        adapter.addFrag(new WatchlistFragment2(), "MW 6");
        adapter.addFrag(new WatchlistFragment2(), "MW 7");

        // set adapter on viewpager
        binding.viewPager.setAdapter(adapter);
    }
}