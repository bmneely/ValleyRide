package com.benneelyvalleyride;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

/**
 * Created by benneely on 11/14/13.
 */
public class SystemMapFragment extends SupportMapFragment {
    private ArrayList<Route> mRoutes;

    GoogleMap mGoogleMap;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);

        mGoogleMap = getMap();

        if (savedInstanceState == null) {
            mGoogleMap.setMapType( GoogleMap.MAP_TYPE_NORMAL );
        }


        Routes routes = Routes.get(getActivity());

        mRoutes = routes.getRoutes();

        for (int i = 0; i < mRoutes.size(); i++){

            Route route = mRoutes.get(i);

            for (int j = 0; j < route.getInBoundStops().size(); j++){
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.position(route.getInBoundStops().get(j).mCordinate);
                markerOptions.title(route.getInBoundStops().get(j).mStopName);
                markerOptions.snippet(route.getInBoundStops().get(j).arrivalTimesToString());
                markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
                mGoogleMap.addMarker(markerOptions);
            }

            for (int j = 0; j < route.getOutBoundStops().size(); j++){
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.position(route.getOutBoundStops().get(j).mCordinate);
                markerOptions.title(route.getOutBoundStops().get(j).mStopName);
                markerOptions.snippet(route.getOutBoundStops().get(j).arrivalTimesToString());
                markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
                mGoogleMap.addMarker(markerOptions);
            }
         }

        if (savedInstanceState == null){
            mGoogleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(43.6040, -116.2040), 15));
            mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(13), 2000, null);
        }
    }

}
