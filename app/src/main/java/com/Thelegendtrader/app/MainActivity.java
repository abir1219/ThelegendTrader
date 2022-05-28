package com.Thelegendtrader.app;

import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.Thelegendtrader.app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private AppBarConfiguration appBarConfiguration;
    private NavController navController;
    private NavOptions.Builder navBuilder;

    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setDefaultView();
    }

    private void setDefaultView() {
        appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home)
                .build();
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(binding.appBarMain.bottomNavView, navController);
        //NavigationUI.setupWithNavController(binding.navView, navController);
        navBuilder =  new NavOptions.Builder();
        navBuilder.setEnterAnim(R.anim.fade_in_animation)
                .setExitAnim(R.anim.fade_out_animation)
                .setPopEnterAnim(R.anim.fade_in_animation)
                .setPopExitAnim(R.anim.fade_out_animation);

       /* mDrawerToggle = new ActionBarDrawerToggle(this,  binding.drawerLayout,
                R.drawable.open, R.string.Home) {

            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                // Do whatever you want here
                Log.e("onDrawerClosed= ", "Closed");
            }
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                // Do whatever you want here
                Log.e("onDrawerOpened= ", "Closed");
            }
        };
        binding.drawerLayout.addDrawerListener(mDrawerToggle);*/
    }

}