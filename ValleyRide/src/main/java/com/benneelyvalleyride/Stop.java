package com.benneelyvalleyride;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by benneely on 11/12/13.
 */
public class Stop {

    private UUID mId;
    private String mStopName;
    private LatLng mCordinate;
    private ArrayList<Integer> mArrivalTimes;

    public Stop(String mStopName, LatLng mCordinate, ArrayList<Integer> mArrivalTimes){
        this.mId = UUID.randomUUID();
        this.mStopName = mStopName;
        this.mCordinate = mCordinate;
        this.mArrivalTimes = mArrivalTimes;
    }

    public String getStopName() {
        return mStopName;
    }

    public UUID getId() {
        return mId;
    }

    public void setStopName(String mStopName) {
        this.mStopName = mStopName;
    }

    public LatLng getCordinate() {
        return mCordinate;
    }

    public void setCordinate(LatLng mCordinate) {
        this.mCordinate = mCordinate;
    }

    public ArrayList<Integer> getArrivalTimes() {
        return mArrivalTimes;
    }

    public void setArrivalTimes(ArrayList<Integer> mArrivalTimes) {
        this.mArrivalTimes = mArrivalTimes;
    }

    public String arrivalTimesToString(){
        StringBuilder out = new StringBuilder();
        for( int i = 0; i < mArrivalTimes.size(); i++){
            out.append(mArrivalTimes.get(i) + "\n");
        }
        return out.toString();
    }
}
