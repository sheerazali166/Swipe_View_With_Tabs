package com.example.swipeviewwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class DemoCollectionAdapter extends FragmentStatePagerAdapter {

    public DemoCollectionAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        DemoFragment demoFragment = new DemoFragment();
        Bundle bundle = new Bundle();
        position = position + 1;
        bundle.putString("message", "Hello from " + position);
        demoFragment.setArguments(bundle);
        return demoFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        position = position + 1;

        return "Fragment " + position;
    }
}
