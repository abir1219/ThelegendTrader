package com.Thelegendtrader.app.Activity.ui.Portfolio;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Thelegendtrader.app.Activity.ui.Adapter.ViewPagerAdapter;
import com.Thelegendtrader.app.Activity.ui.Orders.ExecutedFragment;
import com.Thelegendtrader.app.Activity.ui.Orders.GttFragment;
import com.Thelegendtrader.app.Activity.ui.Orders.OpenFragment;
import com.Thelegendtrader.app.R;
import com.Thelegendtrader.app.databinding.FragmentPortfolioListBinding;

public class PortfolioListFragment extends Fragment {
    FragmentPortfolioListBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPortfolioListBinding.inflate(inflater,container,false);
        setViewPager();
        return binding.getRoot();
    }

    private void setViewPager() {
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());

        // add your fragments
        adapter.addFrag(new HoldingsFragment(), "Holdings");
        adapter.addFrag(new PositionsFragment(), "Positions");

        // set adapter on viewpager
        binding.viewPager.setAdapter(adapter);
    }
}