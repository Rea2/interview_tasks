package com.raik.travel.vouchers;

import com.raik.travel.Place;
import com.raik.travel.Price;
import com.raik.travel.enumerations.BookingStatus;
import com.raik.travel.enumerations.FoodType;
import com.raik.travel.enumerations.Transport;
import com.raik.travel.exceptions.OperationException;
import com.raik.travel.interfaces.Bookable;
import java.util.Calendar;


/**
 * Created by Raik Yauheni on 25.09.2018.
 */
public abstract class TravelVoucher implements Bookable {

    private static int count = 0;
    private int id;
    private String title;
    private Calendar startDate;
    private int durationDays;
    private Place place;
    private Transport transport;
    private FoodType foodType;
    private BookingStatus bookingStatus;
    private Price price;

    public TravelVoucher(String title) {
        this.title = title;
        this.id = ++count;
    }

    public String getTitle() {
        return title;
    }

    public TravelVoucher setTitle(String title) {
        this.title = title;
        return this;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public TravelVoucher setStartDate(Calendar startDate) {
        this.startDate = startDate;
        return this;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public TravelVoucher setDurationDays(int durationDays) {
        this.durationDays = durationDays;
        return this;
    }

    public Place getPlace() {
        return place;
    }

    public TravelVoucher setPlace(Place place) {
        this.place = place;
        return this;
    }

    public Transport getTransport() {
        return transport;
    }

    public TravelVoucher setTransport(Transport transport) {
        this.transport = transport;
        return this;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public TravelVoucher setFoodType(FoodType foodType) {
        this.foodType = foodType;
        return this;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public TravelVoucher setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public TravelVoucher setPrice(Price price) {
        this.price = price;
        return this;
    }

    public int getId() {
        return id;
    }



// implementation Interface Bookable
    @Override
    public boolean book() throws OperationException {
        if (getStatus() == BookingStatus.AVAILABLE)
        {
            System.out.println("...is booking");
            setBookingStatus(BookingStatus.BOOKED);
            System.out.println("Booking has been completed succsessfully ");
            return true;
        }
        else {
            System.out.println("Booking is unable");
            return false;
        }
    }

    @Override
    public boolean unbook() {
        if (getStatus() == BookingStatus.BOOKED)
        {
            System.out.println("...is unbooknig");

            setBookingStatus(BookingStatus.AVAILABLE);
            return true;
        }
        else {
            System.out.println("Unbooking is not permitted");
            return false;
        }
    }

    @Override
    public BookingStatus getStatus() {
        return getBookingStatus();
    }

// implementation Interface Comparable


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ID: "+ id + "\n");
        if (title != null) result.append("Title: "+ title  + "\n");
        if (startDate != null) result.append("Start Date: "+ String.format("%td.%<tm.%<ty \n", startDate.getTime()));
        result.append("Duration: "+ durationDays  + " days \n");
        if (place != null) result.append("" + place.toString() + "\n");
        result.append("Transport: " + transport.toString() + "\n")
            .append("FoodType: " + foodType.getAbreviation() + "\n");

        return result.toString();
    }
}




