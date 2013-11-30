package com.benneelyvalleyride;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by benneely on 11/12/13.
 */
public class Route {

    public int mRouteNumber;

    public String mRouteName;

    public int mRouterColor;
    public ArrayList<Stop> mOutBoundStops;
    public ArrayList<Stop> mInBoundStops;
    public int mRouteImageId;

    public Route(int mRouteNumber, String mRouteName, int mRouterColor, int mRouteImageId, ArrayList<Stop> mOutBoundStops, ArrayList<Stop> mInBoundStops) {
        this.mRouteNumber = mRouteNumber;
        this.mRouteName = mRouteName;
        this.mRouteImageId = mRouteImageId;
        this.mRouterColor = mRouterColor;
        this.mOutBoundStops = mOutBoundStops;
        this.mInBoundStops = mInBoundStops;
    }

    public String getRouteName() {
        return mRouteName;
    }

    public int getRouteNumber() {
        return mRouteNumber;
    }

    public int getRouteImageId() { return mRouteImageId; }

    public ArrayList<Integer> getStopArrivalTmmesByStopID (UUID stopId){

        for(Stop s : this.getInBoundStops()){
            if (s.getId() == stopId){
                return s.mArrivalTimes;
//                ArrayList<String> ret = new ArrayList<String>();
//                for (int i = 0; i < s.mArrivalTimes.size(); i++){
//                    ret.add(s.mArrivalTimes.get(i).toString());
//                }
//                return ret;
            }
        }

        for (Stop s : this.getOutBoundStops()){
            if (s.getId().equals(stopId)){
                return s.mArrivalTimes;
//                ArrayList<String> ret = new ArrayList<String>();
//                for (int i = 0; i < s.mArrivalTimes.size(); i++){
//                    ret.add(s.mArrivalTimes.get(i).toString());
//                }
//                return ret;
            }
        }
        return null;
    }

    public Stop getStopById(UUID stopId){
        for(Stop s : this.getInBoundStops()){
            if (s.getId().equals(stopId)){
                return s;
            }
        }
        for (Stop s : this.getOutBoundStops()){
            if (s.getId().equals(stopId)){
                return s;
            }
        }
        return null;
    }
    public void setRouteNumber(int mRouteNumber) {
        this.mRouteNumber = mRouteNumber;
    }

    public void setRouteName(String mRouteName) {
        this.mRouteName = mRouteName;
    }

    public int getRouterColor() {
        return mRouterColor;
    }

    public void setRouterColor(int mRouterColor) {
        this.mRouterColor = mRouterColor;
    }

    public ArrayList<Stop> getOutBoundStops() {
        return mOutBoundStops;
    }

    public void setOutBoundStops(ArrayList<Stop> mOutBoundStops) {
        this.mOutBoundStops = mOutBoundStops;
    }

    public ArrayList<Stop> getInBoundStops() {
        return mInBoundStops;
    }

    public void setInBoundStops(ArrayList<Stop> mInBoundStops) {
        this.mInBoundStops = mInBoundStops;
    }
}
