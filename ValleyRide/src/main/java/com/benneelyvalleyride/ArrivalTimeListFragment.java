package com.benneelyvalleyride;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.joda.time.*;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by benneely on 11/17/13.
 */
public class ArrivalTimeListFragment extends ListFragment {
    private ArrayList<Integer> mArrivalTimes;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Route r  = Routes.get(getActivity()).getRouteByRouteNumber(getArguments().getInt(ShowStopsActivity.ROUTE_NUMBER, -1));
        UUID id = (UUID)getArguments().getSerializable(ShowStopsActivity.STOP_ID);


        getActivity().setTitle(r.getStopById(id).getStopName());

        mArrivalTimes = r.getStopArrivalTmmesByStopID(id);

        ArrivalTimesAdapter adapter = new ArrivalTimesAdapter(mArrivalTimes);
        setListAdapter(adapter);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    private class ArrivalTimesAdapter extends ArrayAdapter<Integer> {
        public ArrivalTimesAdapter(ArrayList<Integer> routes){
            super(getActivity(), 0, routes);
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_arrival_time, null);
            }

            Integer time = getItem(position);

            DateTime dt = new DateTime();  // current time

            TextView arrivalTextView = (TextView)convertView.findViewById(R.id.arrival_time_list_item);
            arrivalTextView.setText(prettyUpMyTime(time));
//            if (((time / 100) * 60 + (time % 100)) < dt.getMinuteOfDay()){
            if (((time / 100) * 60 + (time % 100)) < 840){
                arrivalTextView.setTextColor(Color.GRAY);
            } else {
                arrivalTextView.setTextColor(Color.BLACK);
            }
            return convertView;
        }

        private String prettyUpMyTime(int time){
            int hours = time / 100;
            String minutes;
            int min = time % 100;

            if (min < 10){
                minutes = "0" + min;
            } else {
                minutes = min + "";
            }

            if ((hours / 13 == 1)){
                return "  " + (hours - 12) + ":" + minutes + " PM";
            }
            else if (hours == 12){
                return hours + ":" + minutes + " PM";
            } else if (hours == 10 || hours == 11){
                return hours + ":" + minutes + " AM";
            } else {
                return "  " + hours + ":" + minutes + " AM";
            }
        }
    }
}
