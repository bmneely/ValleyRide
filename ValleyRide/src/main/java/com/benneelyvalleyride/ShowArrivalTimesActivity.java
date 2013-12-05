package com.benneelyvalleyride;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.Locale;

/**
* Created by benneely on 11/14/13.
*/
public class ShowArrivalTimesActivity extends FragmentActivity implements ActionBar.TabListener {
    SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });

        for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
            actionBar.addTab(actionBar.newTab().setText(mSectionsPagerAdapter.getPageTitle(i)).setTabListener(this));
        }
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment;
            Bundle args;
            switch (position) {
                case 0:
                    fragment = new ArrivalTimeListFragment();
                    args = new Bundle();
                    args.putInt(ShowStopsActivity.ROUTE_NUMBER, getIntent().getIntExtra(ShowStopsActivity.ROUTE_NUMBER, 1));
                    args.putSerializable(ShowStopsActivity.STOP_ID, getIntent().getSerializableExtra(ShowStopsActivity.STOP_ID));
                    fragment.setArguments(args);
                    break;
                case 1:
                    fragment = new StopMapFragment();
                    args = new Bundle();
                    args.putInt(ShowStopsActivity.ROUTE_NUMBER, getIntent().getIntExtra(ShowStopsActivity.ROUTE_NUMBER, 1));
                    args.putSerializable(ShowStopsActivity.STOP_ID, getIntent().getSerializableExtra(ShowStopsActivity.STOP_ID));
                    fragment.setArguments(args);
                    break;

                default:
                    fragment = null;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_arrival_times).toUpperCase(l);
                case 1:
                    return getString(R.string.title_stop_map).toUpperCase(l);
            }
            return null;
        }
    }
}
