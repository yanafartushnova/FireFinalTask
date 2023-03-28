package com.example.FireFinalTask.model;

public class CountByCountry {
    private final String country;
    private final int count;

    public CountByCountry(String country, int count) {
        this.country = country;
        this.count = count;
    }

    public String getCountry(){
        return country;
    }

    public int getCount() {
        return count;
    }
}
