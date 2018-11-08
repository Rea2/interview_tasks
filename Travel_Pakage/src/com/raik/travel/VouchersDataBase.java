package com.raik.travel;

import com.raik.travel.enumerations.FoodType;
import com.raik.travel.enumerations.Transport;
import com.raik.travel.exceptions.OperationException;
import com.raik.travel.interfaces.TravelAgencyGateway;
import com.raik.travel.vouchers.TravelVoucher;
import sun.plugin.com.event.COMEventHandler;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by Rea1 on 25.09.2018.
 */
public class VouchersDataBase implements TravelAgencyGateway {

    private Map<Integer, TravelVoucher> mapOfVouchers = new HashMap<>();

    public Map<Integer, TravelVoucher> getMapOfVouchers() {
        return mapOfVouchers;
    }

    public void setMapOfVouchers(Map<Integer, TravelVoucher> mapOfVouchers) {
        this.mapOfVouchers = mapOfVouchers;
    }

    @Override
    public boolean addVoucher(TravelVoucher travelVoucher)  {
        if (mapOfVouchers.put(travelVoucher.getId(), travelVoucher) != null) return true;
        else return false;
    }

    @Override
    public boolean removeVoucher(int id)  {
        if (mapOfVouchers.remove (id) != null) return true;
        else return false;
    }

    @Override
    public boolean bookVoucher(int id) throws OperationException {
        if (mapOfVouchers.containsKey(id)) {
            return (mapOfVouchers.get(id).book());
        }
        else return false;
    }

    @Override
    public boolean unBookVoucher(int id) throws OperationException {
        if (mapOfVouchers.containsKey(id)) {
            return (mapOfVouchers.get(id).unbook());
        }
        else return false;
    }

    public void printMap (Map<Integer, TravelVoucher> map) {
        for(Entry<Integer, TravelVoucher> entry: map.entrySet()) System.out.println(entry.getValue().toString());
    }

    public Map<Integer, TravelVoucher> getSelectedVouchers(Map<Integer, TravelVoucher> map, Transport transport) {
        Map<Integer, TravelVoucher> result = new HashMap<>();
            for(Entry<Integer, TravelVoucher> entry: map.entrySet()) {
                if (entry.getValue().getTransport() == transport)  {
                    result.put(entry.getKey(), entry.getValue());
                }
            }
        return new TreeMap<Integer, TravelVoucher>(result);
    }

    public Map<Integer, TravelVoucher> getSelectedVouchers(Map<Integer, TravelVoucher> map, FoodType food) {
        Map<Integer, TravelVoucher> result = new HashMap<>();
            for(Entry<Integer, TravelVoucher> entry: map.entrySet()) {
                if (entry.getValue().getFoodType() == food)  {
                    result.put(entry.getKey(), entry.getValue());
                }
        }
        return new TreeMap<Integer, TravelVoucher>(result);
    }

    public Map<Integer, TravelVoucher> getSelectedVouchers(Map<Integer, TravelVoucher> map, int durationDaysMin, int durationDaysMax) {
        Map<Integer, TravelVoucher> result = new HashMap<>();
        for(Entry<Integer, TravelVoucher> entry: map.entrySet()) {
                if (entry.getValue().getDurationDays() >= durationDaysMin
                    && entry.getValue().getDurationDays() <= durationDaysMax)  {
                    result.put(entry.getKey(), entry.getValue());
                }
        }
        return new TreeMap<Integer, TravelVoucher>(result);
    }

    public Map<Integer, TravelVoucher> sortByDurationDays(Map<Integer, TravelVoucher> map) {

            List<Entry<Integer, TravelVoucher>> list = new ArrayList<>(map.entrySet());
            list.sort(new Comparator<Entry<Integer, TravelVoucher>>() {
                @Override
                public int compare(Entry<Integer, TravelVoucher> o1, Entry<Integer, TravelVoucher> o2) {
                    return o1.getValue().getDurationDays() - o2.getValue().getDurationDays();
                }
            });
            Map<Integer, TravelVoucher> result = new LinkedHashMap<>();
            for (Entry<Integer, TravelVoucher> entry : list) {
            result.put(entry.getKey(), entry.getValue());
            }
            return result;

    }



}

