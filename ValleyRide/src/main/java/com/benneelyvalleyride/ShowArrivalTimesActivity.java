package com.benneelyvalleyride;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
* Created by benneely on 11/14/13.
*/
public class ShowArrivalTimesActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_arrival_times);

        FragmentManager fm = getSupportFragmentManager();

        ArrivalTimeListFragment fragment = new ArrivalTimeListFragment();
        Bundle args = new Bundle();
        args.putBoolean(ShowStopsActivity.OUT_BOUND, true);
        args.putInt(ShowStopsActivity.ROUTE_NUMBER, getIntent().getIntExtra(ShowStopsActivity.ROUTE_NUMBER, 1));
        args.putSerializable(ShowStopsActivity.STOP_ID, getIntent().getSerializableExtra(ShowStopsActivity.STOP_ID));
        fragment.setArguments(args);
        fm.beginTransaction().add(R.id.fragmentContainer, fragment ).commit();
    }
}
