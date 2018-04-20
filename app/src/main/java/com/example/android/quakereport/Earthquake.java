package com.example.android.quakereport;

/**
 * Created by mf on 17/04/2018.
 */

public class Earthquake {
    private String mMagnitude;
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
