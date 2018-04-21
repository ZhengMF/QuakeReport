package com.example.android.quakereport;

/**
 * Created by mf on 17/04/2018.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
