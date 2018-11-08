package com.raik.travel.interfaces;

import com.raik.travel.exceptions.OperationException;
import com.raik.travel.vouchers.TravelVoucher;

/**
 * Created by Rea1 on 25.09.2018.
 */
public interface TravelAgencyGateway {

    boolean addVoucher(TravelVoucher travelVoucher) throws OperationException;

    boolean removeVoucher(int id)throws OperationException;

    boolean bookVoucher( int id) throws OperationException;

    boolean unBookVoucher(int id) throws OperationException;
}
