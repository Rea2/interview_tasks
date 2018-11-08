package com.raik.travel.interfaces;

import com.raik.travel.exceptions.OperationException;
import com.raik.travel.enumerations.BookingStatus;

/**
 * Created by Rea1 on 25.09.2018.
 */
public interface Bookable {

    boolean book() throws OperationException;

    boolean unbook() throws OperationException;

    BookingStatus getStatus();
}
