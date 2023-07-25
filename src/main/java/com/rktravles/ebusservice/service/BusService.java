package com.rktravles.ebusservice.service;

import com.rktravles.ebusservice.model.Bus;

import java.util.List;

public interface BusService {

    public List<Bus> createBus(Integer count);

    public List<Bus> fetchBuses();
}
