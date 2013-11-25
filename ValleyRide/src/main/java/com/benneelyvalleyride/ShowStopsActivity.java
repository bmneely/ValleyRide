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
public class ShowStopsActivity extends FragmentActivity implements ActionBar.TabListener {
    public static final String ROUTE_NUMBER = "com.benneelyvalleyride.route_number";
    public static final String OUT_BOUND = "com.benneelyvalleyride.out_bound";
    public static final String STOP_ID = "com.benneelyvalleyride.stop_id";

    SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        setTitle("Route " + getIntent().getIntExtra(ROUTE_NUMBER, 1) + ": " +  Routes.get(this).getRouteByRouteNumber(getIntent().getIntExtra(ROUTE_NUMBER, 1)).getRouteName());

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
                    fragment = new StopListFragment();
                    args = new Bundle();
                    args.putInt(ROUTE_NUMBER, getIntent().getIntExtra(ROUTE_NUMBER, 1));
                    args.putBoolean(OUT_BOUND, true);
                    fragment.setArguments(args);
                    break;
                case 1:
                    fragment = new StopListFragment();
                    args = new Bundle();
                    args.putInt(ROUTE_NUMBER, getIntent().getIntExtra(ROUTE_NUMBER, 1));
                    args.putBoolean(OUT_BOUND, false);
                    fragment.setArguments(args);
                    break;
                case 2:
                    fragment = new RouteMapFragment();
                    args = new Bundle();
                    args.putInt(ROUTE_NUMBER, getIntent().getIntExtra(ROUTE_NUMBER, 1));
                    fragment.setArguments(args);
                    break;
                default:
                    fragment = null;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_out_bound_stops).toUpperCase(l);
                case 1:
                    return getString(R.string.title_in_bound_stops).toUpperCase(l);
                case 2:
                    return getString(R.string.title_route_stops).toUpperCase(l);
            }
            return null;
        }
    }

}
