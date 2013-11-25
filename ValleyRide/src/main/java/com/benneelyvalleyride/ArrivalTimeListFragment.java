package com.benneelyvalleyride;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by benneely on 11/17/13.
 */
public class ArrivalTimeListFragment extends ListFragment {
    private ArrayList<String> mArrivalTimes;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Route r  = Routes.get(getActivity()).getRouteByRouteNumber(getArguments().getInt(ShowStopsActivity.ROUTE_NUMBER, -1));
        UUID id = (UUID)getArguments().getSerializable(ShowStopsActivity.STOP_ID);

        if (getArguments().getBoolean(ShowStopsActivity.OUT_BOUND)){
            getActivity().setTitle(r.getStopById(id).getStopName() + " Arrival Times" );
        } else {
            getActivity().setTitle(r.getStopById(id).getStopName() + " Arrival Times" );
        }

        mArrivalTimes = r.getStopArrivalTmmesByStopID(id);

        ArrivalTimesAdapter adapter = new ArrivalTimesAdapter(getActivity(), mArrivalTimes);
        setListAdapter(adapter);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    private class ArrivalTimesAdapter extends BaseAdapter {
        private ArrayList<String> mTimes;
        private LayoutInflater mInflater;


        public ArrivalTimesAdapter (Context c, ArrayList<String> times){
            mTimes = times;
            mInflater = LayoutInflater.from(c);
        }

        @Override
        public int getCount() {
            return mTimes.size();
        }

        @Override
        public Object getItem(int position) {
            return mTimes.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView == null) {
                convertView = mInflater.inflate(R.layout.list_item_arrival_time, parent, false);
                convertView.setTag(R.id.arrival_time_list_item, convertView.findViewById(R.id.arrival_time_list_item));
            }

            String time = (String)getItem(position);

            TextView arrivalTextView = (TextView)convertView.getTag(R.id.arrival_time_list_item);
            arrivalTextView.setText(time);

            return convertView;
        }
    }
}
