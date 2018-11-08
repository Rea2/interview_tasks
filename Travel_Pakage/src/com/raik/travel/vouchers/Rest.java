package com.raik.travel.vouchers;

import com.raik.travel.enumerations.BeachType;

/**
 * Created by Rea1 on 25.09.2018.
 */
public class Rest extends TravelVoucher {

    private BeachType beachType;

    public Rest(String title) {
        super(title);
    }


    public BeachType getBeachType() {
        return beachType;
    }

    public Rest setBeachType(BeachType beachType) {
        this.beachType = beachType;
        return this;
    }


}
