package com.Thelegendtrader.app.Activity.ui.Tools;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Thelegendtrader.app.Activity.ui.Adapter.ViewPagerAdapter;
import com.Thelegendtrader.app.Activity.ui.Portfolio.HoldingsFragment;
import com.Thelegendtrader.app.Activity.ui.Portfolio.PositionsFragment;
import com.Thelegendtrader.app.R;
import com.Thelegendtrader.app.databinding.FragmentToolsListBinding;

public class ToolsListFragment extends Fragment {
    FragmentToolsListBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentToolsListBinding.inflate(inflater,container,false);
        setViewPager();
        return binding.getRoot();
    }

    private void setViewPager() {
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());

        // add your fragments
        adapter.addFrag(new BasketsFragment(), "Baskets");
        adapter.addFrag(new SipFragment(), "SIPs");
        adapter.addFrag(new AlertsFragment(), "Alerts");

        // set adapter on viewpager
        binding.viewPager.setAdapter(adapter);
    }
}