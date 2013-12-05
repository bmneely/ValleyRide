package com.benneelyvalleyride;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by benneely on 12/5/13.
 */
public class StopMapFragment extends SupportMapFragment {
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

        Route route  = Routes.get(getActivity()).getRouteByRouteNumber(getArguments().getInt(ShowStopsActivity.ROUTE_NUMBER, -1));
        UUID id = (UUID)getArguments().getSerializable(ShowStopsActivity.STOP_ID);
        Stop stop = route.getStopById(id);


        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(stop.getCordinate());
        markerOptions.title(stop.getStopName());
        markerOptions.snippet("Route " + route.getRouteNumber());
        BitmapDrawable d=(BitmapDrawable) getResources().getDrawable(route.getRouteImageId());
        Bitmap b=d.getBitmap();
        Bitmap bhalfsize=Bitmap.createScaledBitmap(b, b.getWidth() / 2, b.getHeight() / 2, false);

        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bhalfsize));
        mGoogleMap.addMarker(markerOptions);

        mGoogleMap.setMyLocationEnabled(true);

        LocationManager service = (LocationManager) getActivity().getSystemService(getActivity().LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        String provider = service.getBestProvider(criteria, false);
        Location location = service.getLastKnownLocation(provider);

        LatLng userLocation = new LatLng(43.600544,-116.198125);

        if (location != null) {
            userLocation =  new LatLng(location.getLatitude(),location.getLongitude());
        }

        mGoogleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(userLocation, 13));
    }
}
