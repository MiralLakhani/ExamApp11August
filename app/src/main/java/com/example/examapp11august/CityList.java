package com.example.examapp11august;

public class CityList {
    private String country;
    private String capital;
    private int imgCapitalFlag;
    private  String cityName;
    private int imgCity;
    private double price;

    public CityList(String country, String capital, int imgCapitalFlag, String cityName, int imgCity, double price) {
        this.country = country;
        this.capital = capital;
        this.imgCapitalFlag = imgCapitalFlag;
        this.cityName = cityName;
        this.imgCity = imgCity;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getImgCapitalFlag() {
        return imgCapitalFlag;
    }

    public void setImgCapitalFlag(int imgCapitalFlag) {
        this.imgCapitalFlag = imgCapitalFlag;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getImgCity() {
        return imgCity;
    }

    public void setImgCity(int imgCity) {
        this.imgCity = imgCity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
