package com.example.examapp11august;

public class VisitedCities {
    private String cityName;
    private double total;
    private int person;

    public VisitedCities(String cityName, double total, int person) {
        this.cityName = cityName;
        this.total = total;
        this.person = person;

    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

}