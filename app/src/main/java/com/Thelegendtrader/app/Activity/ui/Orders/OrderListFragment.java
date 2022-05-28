package com.Thelegendtrader.app.Activity.ui.Orders;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Thelegendtrader.app.Activity.ui.Adapter.ViewPagerAdapter;
import com.Thelegendtrader.app.Activity.ui.Watchlist.WatchlistFragment;
import com.Thelegendtrader.app.Activity.ui.Watchlist.WatchlistFragment2;
import com.Thelegendtrader.app.R;
import com.Thelegendtrader.app.databinding.FragmentOrderListBinding;


public class OrderListFragment extends Fragment {
    FragmentOrderListBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentOrderListBinding.inflate(inflater,container,false);
        setViewPager();
        return binding.getRoot();
    }

    private void setViewPager() {
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());

        // add your fragments
        adapter.addFrag(new OpenFragment(), "Open");
        adapter.addFrag(new ExecutedFragment(), "Executed");
        adapter.addFrag(new GttFragment(), "GTT");

        // set adapter on viewpager
        binding.viewPager.setAdapter(adapter);
    }
}