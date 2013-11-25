package com.benneelyvalleyride;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by benneely on 11/14/13.
 */
public class StopListFragment extends ListFragment {

    private ArrayList<Stop> mStops;
    private Stop mStop;
    StopAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.list_view_container, container, false);

        if (getArguments().getBoolean(ShowStopsActivity.OUT_BOUND)){
            mStops = Routes.get(getActivity()).getRouteByRouteNumber(getArguments().getInt(ShowStopsActivity.ROUTE_NUMBER)).mOutBoundStops;
        }else {
            mStops = Routes.get(getActivity()).getRouteByRouteNumber(getArguments().getInt(ShowStopsActivity.ROUTE_NUMBER)).mInBoundStops;
        }

        adapter = new StopAdapter(mStops);
        setListAdapter(adapter);
        return v;
    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        mStop = (Stop)getListAdapter().getItem(position);
        Intent i = new Intent(getActivity(), ShowArrivalTimesActivity.class);
        i.putExtra(ShowStopsActivity.ROUTE_NUMBER, getArguments().getInt(ShowStopsActivity.ROUTE_NUMBER));
        i.putExtra(ShowStopsActivity.STOP_ID, mStop.getId());
        startActivity(i);
    }

    private class StopAdapter extends ArrayAdapter<Stop> {
        public StopAdapter(ArrayList<Stop> stops){
            super(getActivity(), 0, stops);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_stop, null);
            }

            Stop s = getItem(position);

            TextView routeNumberTextView = (TextView)convertView.findViewById(R.id.stop_list_item);
            routeNumberTextView.setText(s.getStopName());

            return convertView;
        }
    }
}
