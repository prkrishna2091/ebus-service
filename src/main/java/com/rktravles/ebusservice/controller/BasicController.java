package com.rktravles.ebusservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ebus")
public class BasicController {

    @GetMapping("/welcome")
    public String welcomeBus(){
        return "Welcome to eBus service...!";
    }
}
