package com.raik.travel;

import com.raik.travel.enumerations.Country;

/**
 * Created by Rea1 on 25.09.2018.
 */
public class Place {

    Country country;
    String city;
    String address;

    public Place(Country country, String city, String address) {
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdвress() {
        return address;
    }

    public void setAdвress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Place: " + country + ", " + city + ", " + address;
    }
}
