package com.celestrialearthquake_example.earthquake;

import android.location.Location;

import java.util.Date;
import java.util.Objects;

public class Earthquake {
    private String mId;
    private Date mDate;
    private String mDetails;
    private Location mLocation;
    private double mMagnitude;
    private String mLink;

    @Override
    public boolean equals(Object o) {
        if (o instanceof Earthquake){
            return (((Earthquake) o ).getmId().contentEquals(mId));
        }else{
            return false;
        }
    }

    public Earthquake(String mId, Date mDate, String mDetails, Location mLocation, double mMagnitude, String mLink) {
        this.mId = mId;
        this.mDate = mDate;
        this.mDetails = mDetails;
        this.mLocation = mLocation;
        this.mMagnitude = mMagnitude;
        this.mLink = mLink;
    }

    public String getmId() {
        return mId;
    }

    public Date getmDate() {
        return mDate;
    }

    public String getmDetails() {
        return mDetails;
    }

    public Location getmLocation() {
        return mLocation;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLink() {
        return mLink;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
