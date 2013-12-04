package com.benneelyvalleyride;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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

            for (int j = 0; j < route.getOutBoundStops().size(); j++){
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.position(route.getOutBoundStops().get(j).mCordinate);
                markerOptions.title(route.getOutBoundStops().get(j).mStopName);
                markerOptions.snippet("Route " + route.getRouteNumber());
                BitmapDrawable d=(BitmapDrawable) getResources().getDrawable(route.getRouteImageId());
                Bitmap b=d.getBitmap();
                Bitmap bhalfsize=Bitmap.createScaledBitmap(b, b.getWidth()/2,b.getHeight()/2, false);

                markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bhalfsize));
                mGoogleMap.addMarker(markerOptions);
            }
         }

        if (savedInstanceState == null){
            mGoogleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(43.6040, -116.2040), 15));
            mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(13), 2000, null);
        }
    }
}
