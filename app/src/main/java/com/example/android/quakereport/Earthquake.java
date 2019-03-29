package com.example.android.quakereport;

/**
 * Created by sof on 28/03/2019.
 */

public class Earthquake {
    String place;
    double magnitude;
    String date;

    public String getPlace() {
        return place;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getDate() {
        return date;
    }


    public Earthquake(String place, double magnitude, String date) {
        this.place = place;
        this.magnitude = magnitude;
        this.date = date;
    }
}