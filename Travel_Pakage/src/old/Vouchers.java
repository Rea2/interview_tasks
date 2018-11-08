package old;

import com.raik.travel.enumerations.BookingStatus;
import com.raik.travel.enumerations.FoodType;
import com.raik.travel.enumerations.Transport;
import com.raik.travel.interfaces.Bookable;
import com.raik.travel.vouchers.TravelVoucher;

import java.util.*;

/**
 * Created by Rea1 on 25.09.2018.
 */
public class Vouchers {

    private Vouchers() {};

    public static List<TravelVoucher> listOfVouchers = new ArrayList<>();

// Bookable
    public static List<Bookable> getAvalibleVouchers(List<Bookable> listOfBookable) {
        List<Bookable> result = new ArrayList<>();
            for (Bookable bookable :  listOfBookable) {
                if (bookable.getStatus() == BookingStatus.AVAILABLE) result.add(bookable);
            }
        return result;
    }

// Burning old.Vouchers
    public static List<TravelVoucher> getBurnningVouchers (List<TravelVoucher> list) {
        List<TravelVoucher> result = new ArrayList<>();
        for (TravelVoucher tVoucher :  list) {
            double  temp = (tVoucher.getStartDate().getTimeInMillis() - new Date().getTime())/(1000*60*60*24);
            System.out.println(temp);
            if (  (temp < 5.0  && tVoucher.getStatus() == BookingStatus.AVAILABLE))    result.add(tVoucher);
        }
        return result;
    }

//  Transport
    public static List <TravelVoucher> getSortedByTransport(List<TravelVoucher> list) {
        Collections.sort(list, new Comparator<TravelVoucher>() {
            @Override
            public int compare(TravelVoucher o1, TravelVoucher o2) {
                return o1.getTransport().compareTo(o2.getTransport());
            }
        });
        return list;
    }

// Get list with particular types of transport
    public static List <TravelVoucher> getListParticulairTransports(List<TravelVoucher> list ,  Transport...transports) {
        List<TravelVoucher> result = new ArrayList<>();

        for (Transport transp : transports) {
            for (TravelVoucher tVoucher :  list) if (tVoucher.getTransport() == transp && !result.contains(tVoucher)) result.add(tVoucher);
        }
        return result;
    }

// Get list with particular types of transport
    public static List <TravelVoucher> getListParticulairFoods(List<TravelVoucher> list ,  FoodType... foodTypes) {
        List<TravelVoucher> result = new ArrayList<>();
        for (FoodType transp : foodTypes) {
            for (TravelVoucher tVoucher :  list) if (tVoucher.getFoodType() == transp && !result.contains(tVoucher)) result.add(tVoucher);
        }
        return result;
    }

// Get list with particular interval of durationDay
    public static List <TravelVoucher> getListIntervalDurations(List<TravelVoucher> list,  int durationDaysMin, int durationDaysMax) {
        List<TravelVoucher> result = new ArrayList<>();
        for (TravelVoucher tVoucher :  list) {
            if (tVoucher.getDurationDays() >= durationDaysMin
                    && tVoucher.getDurationDays() <= durationDaysMax) result.add(tVoucher);
        }
        Collections.sort(result, Comparator.comparing(TravelVoucher::getStartDate)
                        .thenComparing(TravelVoucher::getStartDate));
    return result;
}
// Print
    public static void printList (List<TravelVoucher> list) {
        for (TravelVoucher travelVoucher : list) System.out.println( travelVoucher.toString());
    }

}



