package com.example.examapp11august;

public class City {
    private String country;
    private String capital;
    private int img;

    public City(String country, String capital, int img) {
        this.country = country;
        this.capital = capital;
        this.img = img;
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

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
