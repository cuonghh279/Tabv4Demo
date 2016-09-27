package com.example.dzunglm.tabv4demo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DzungLM on 9/25/2016.
 */
public class pagarAdapter extends FragmentPagerAdapter{
    public pagarAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new FirstTab();
            case 1:
                return new SecondTab();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
