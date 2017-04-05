package com.example.dadriaunna01.takehomeassignment09_dadriaunnaw;

/**
 * Created by cmltdstudent on 4/5/17.
 */

public class Cohort {

    String advisory;
    double tileScore;
    boolean fridayCelebration;

    public Cohort(String advisory, double tileScore, boolean fridayCelebration) {
        advisory = advisory;
        tileScore = tileScore;
        this.fridayCelebration = fridayCelebration;
    }

    public String getAdvisory() {
        return advisory;
    }

    public double getTileScore() {
        return tileScore;
    }

    public boolean isFridayCelebration() {
        return fridayCelebration;
    }

    @Override
    public String toString() {
        return "Cohort{" +
                "Advisory='" + advisory + '\'' +
                ", TileScore=" + tileScore +
                ", fridayCelebration=" + fridayCelebration +
                '}';
    }
}
