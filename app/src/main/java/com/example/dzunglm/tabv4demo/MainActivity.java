package com.example.dzunglm.tabv4demo;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {
    private ViewPager pager;
    private ActionBar actionBar;
    private pagarAdapter padapter;
    private String[] title = {"First", "Second"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        padapter = new pagarAdapter(getSupportFragmentManager());
        actionBar = getSupportActionBar();

        pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(padapter);

        actionBar.setHomeButtonEnabled(true);
        actionBar.setNavigationMode(actionBar.NAVIGATION_MODE_TABS);
        for(String s:title)
        {
            ActionBar.Tab tab = actionBar.newTab();
            tab.setText(s);
            tab.setTabListener(this);
            actionBar.addTab(tab);
        }
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        pager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
