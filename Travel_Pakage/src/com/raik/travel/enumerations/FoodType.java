package com.raik.travel.enumerations;

/**
 * Created by Rea1 on 25.09.2018.
 */
public enum FoodType {
    ALLINCLUSIVE("ALL"),
    HALF_BOARD("HB"),
    FULL_BOARD("FB"),
    ONLY_BREAKFAST("BB"),
    NONE("None");

    private String abreviation;

    private FoodType(String abreviation) {
        this.abreviation = abreviation;
    }

    public String getAbreviation() {
        return abreviation;
    }
}
