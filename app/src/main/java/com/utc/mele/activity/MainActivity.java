package com.utc.mele.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.utc.mele.R;
import com.utc.mele.databinding.ActivityMainBinding;
import com.utc.mele.fragment.DiscoverFragment;
import com.utc.mele.fragment.HomeFragment;
import com.utc.mele.fragment.LibraryFragment;
import com.utc.mele.fragment.ProfileFragment;
import com.utc.mele.fragment.TrendFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new HomeFragment());
        binding.bottomNavigationView.setBackground(null);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home) {
                replaceFragment(new HomeFragment());
            } else if (item.getItemId() == R.id.trend) {
                replaceFragment(new TrendFragment());
            }
            if (item.getItemId() == R.id.discover) {
                replaceFragment(new DiscoverFragment());
            }
            if (item.getItemId() == R.id.library) {
                replaceFragment(new LibraryFragment());
            }
            if (item.getItemId() == R.id.profile) {
                replaceFragment(new ProfileFragment());
            }

            return true;

        });

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}