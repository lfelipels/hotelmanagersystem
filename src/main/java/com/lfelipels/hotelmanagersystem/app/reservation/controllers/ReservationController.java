package com.lfelipels.hotelmanagersystem.app.reservation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

    @GetMapping("/")
    public String index() {
        return "reservation index";
    }
}
