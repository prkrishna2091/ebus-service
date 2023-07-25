package com.rktravles.ebusservice.controller;

import com.rktravles.ebusservice.model.Bus;
import com.rktravles.ebusservice.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
1. create bus based on count
2. list the bus
3. update the bus status up/down
4. fetch the status of bus by service number
5. fetch buses by  status/service number
6. fetch seats capacity by service number
 */
@RestController
@RequestMapping("/ebus")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping("/create/bus/{count}")
    public ResponseEntity<List<Bus>> createBus(@PathVariable("count") Integer count){

         List<Bus> listOfBuses = busService.createBus(count);
          return new ResponseEntity<List<Bus>>(listOfBuses, HttpStatus.CREATED);
    }
    @GetMapping("/bus/list")
    public ResponseEntity<List<Bus>> fetchBuses(){

        List<Bus> listOfBuses = busService.fetchBuses();
        return new ResponseEntity<List<Bus>>(listOfBuses,HttpStatus.FOUND);
    }
}
