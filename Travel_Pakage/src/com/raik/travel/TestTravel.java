package com.raik.travel;

import com.raik.travel.enumerations.*;
import com.raik.travel.vouchers.*;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by Rea1 on 25.09.2018.
 */
public class TestTravel {

    private static Map<Integer, TravelVoucher> mapTest = new HashMap<>();

    public static void main(String[] args) {

        fillListOfAllVouchers(mapTest);

        VouchersDataBase dB = new VouchersDataBase();

        dB.setMapOfVouchers(mapTest);

        dB.printMap(dB.getMapOfVouchers());

        System.out.println("----------");

        dB.printMap(dB.sortByDurationDays(dB.getMapOfVouchers()));
    }

    private static void fillListOfAllVouchers(Map<Integer, TravelVoucher> map) {

        Calendar calendarTemp = Calendar.getInstance();
        calendarTemp.set(2018, 9, 28);
        TravelVoucher temp = new Rest("One Week in Heaven")
                .setFoodType(FoodType.HALF_BOARD)
                .setBookingStatus(BookingStatus.AVAILABLE)
                .setDurationDays(7)
                .setTransport(Transport.PLAIN)
                .setStartDate(calendarTemp)
                .setPlace(new Place(Country.ITALY, "Venice", "Sna Paola, 12"));
        mapTest.put(temp.getId(), temp);

        temp = new Treatment("Healthy lungs")
                .setFoodType(FoodType.FULL_BOARD)
                .setBookingStatus(BookingStatus.BOOKED)
                .setDurationDays(22)
                .setTransport(Transport.BUS);
        mapTest.put(temp.getId(), temp);

        temp = new Cruise("Cyber Tokio")
                .setFoodType(FoodType.NONE)
                .setBookingStatus(BookingStatus.DEVELOPING)
                .setDurationDays(3)
                .setTransport(Transport.TRAIN);
        mapTest.put(temp.getId(), temp);

        temp = new Rest("Spanish coust")
                .setFoodType(FoodType.ALLINCLUSIVE)
                .setBookingStatus(BookingStatus.EXPIRED)
                .setDurationDays(3)
                .setTransport(Transport.TRAIN);
        mapTest.put(temp.getId(), temp);
    }


}








