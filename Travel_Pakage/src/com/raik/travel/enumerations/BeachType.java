package com.raik.travel.enumerations;

/**
 * Created by Rea1 on 25.09.2018.
 */
public enum BeachType {
    NONE ("No beatch"),
    PEBBLES ("Pebbles"),
    POOL("Pool"),
    SAND("Sandy");

    private String abbrevation;

    private BeachType(String abbrevation) {
    }

    public String getAbbrevation() {
        return abbrevation;
    }
}
