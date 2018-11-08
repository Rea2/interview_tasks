package com.raik.travel.vouchers;

import com.raik.travel.Place;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rea1 on 25.09.2018.
 */
public class Cruise extends TravelVoucher {

    private List<Place> destinations = new ArrayList<Place>();

    public Cruise(String title) {
        super(title);
    }

    public List<Place> getDestinations() {
        return destinations;
    }

    public Cruise setDestinations(List<Place> destinations) {
        this.destinations = destinations;
        return this;
    }
}
