package com.raik.travel.vouchers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rea1 on 25.09.2018.
 */
public class ShoppingTour extends TravelVoucher {

    private List<String> listOfShop = new ArrayList<>();

    public ShoppingTour(String title) {
        super(title);
    }
    public List<String> getListOfShop() {
        return listOfShop;
    }

    public ShoppingTour setListOfShop(List<String> listOfShop) {
        this.listOfShop = listOfShop;
        return this;
    }

}
