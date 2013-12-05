package com.benneelyvalleyride;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class RouteMapFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)  {
        View v = inflater.inflate(R.layout.activity_route_map, container, false);
        Route r = Routes.get(getActivity()).getRouteByRouteNumber(getArguments().getInt(ShowStopsActivity.ROUTE_NUMBER));

        ImageView image = (ImageView) v.findViewById(R.id.imageView1);
        image.setScaleType(ImageView.ScaleType.FIT_XY);

        image.setImageResource(r.getRouteMapId());
        return v;
    }
}

