package com.raik.travel.vouchers;

import java.util.ArrayList;
import java.util.List;

    /**
     * Created by Rea1 on 25.09.2018.
     */
public class Treatment extends TravelVoucher {

    private List<String> listOftreatments = new ArrayList<>();

    public Treatment(String title) {
        super(title);
    }

    public List<String> getListOftreatments() {
        return listOftreatments;
    }

    public Treatment setListOftreatments(List<String> listOftreatments) {
        this.listOftreatments = listOftreatments;
        return this;
    }
}
