package com.benneelyvalleyride;

import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by benneely on 11/17/13.
 */
public class RouteMapFragment extends SupportMapFragment{
    private Route mRoute;
    GoogleMap mGoogleMap;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);

        mGoogleMap = getMap();

        if (savedInstanceState == null) {
            mGoogleMap.setMapType( GoogleMap.MAP_TYPE_NORMAL );
        }

        mRoute = Routes.get(getActivity()).getRouteByRouteNumber(getArguments().getInt(ShowStopsActivity.ROUTE_NUMBER));


        for (int j = 0; j < mRoute.getInBoundStops().size(); j++){
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(mRoute.getInBoundStops().get(j).mCordinate);
            markerOptions.title(mRoute.getInBoundStops().get(j).mStopName);
            markerOptions.snippet(mRoute.getInBoundStops().get(j).arrivalTimesToString());
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mGoogleMap.addMarker(markerOptions);
        }

        for (int j = 0; j < mRoute.getOutBoundStops().size(); j++){
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(mRoute.getOutBoundStops().get(j).mCordinate);
            markerOptions.title(mRoute.getOutBoundStops().get(j).mStopName);
            markerOptions.snippet(mRoute.getOutBoundStops().get(j).arrivalTimesToString());
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
            mGoogleMap.addMarker(markerOptions);
        }

        if (savedInstanceState == null){
            mGoogleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(43.6040, -116.2040), 15));
            mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(13), 2000, null);
        }

    }

}
