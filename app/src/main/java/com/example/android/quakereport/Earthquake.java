package com.example.android.quakereport;

/**
 * Created by mf on 17/04/2018.
 */

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private String mTime;

    public Earthquake(String magnitude, String location, String time) {
        mMagnitude = magnitude;
        mLocation = location;
        mTime = time;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getTime() {
        return mTime;
    }
}