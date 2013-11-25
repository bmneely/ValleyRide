package com.benneelyvalleyride;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by benneely on 10/18/13.
 */
public class RouteListFragment extends ListFragment {
    private ArrayList<Route> mRoutes;
    Route mRoute;
    RouteAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.list_view_container, container, false);

        mRoutes = Routes.get(getActivity()).getRoutes();
        adapter = new RouteAdapter(mRoutes);
        setListAdapter(adapter);
        return v;
    }


    public void onListItemClick(ListView l, View v, int position, long id) {
        mRoute = (Route)getListAdapter().getItem(position);
        Intent i = new Intent(getActivity(), ShowStopsActivity.class);
        i.putExtra(ShowStopsActivity.ROUTE_NUMBER, mRoute.getRouteNumber());
        startActivity(i);
    }

    private class RouteAdapter extends ArrayAdapter<Route> {
        public RouteAdapter(ArrayList<Route> routes){
            super(getActivity(), 0, routes);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_route, null);
            }

            Route r = getItem(position);

            ImageView iconImageView = (ImageView) convertView.findViewById(R.id.route_list_item_icon);
            iconImageView.setImageDrawable(getResources().getDrawable(r.getRouteImageId()));

            TextView routeNumberTextView = (TextView)convertView.findViewById(R.id.route_list_item_routeNumberTextView);
            routeNumberTextView.setText("Route " + r.getRouteNumber());

            TextView routeNameTextView = (TextView)convertView.findViewById(R.id.route_list_item_nameTextView);
            routeNameTextView.setText(r.getRouteName());

            return convertView;
        }
    }
}
