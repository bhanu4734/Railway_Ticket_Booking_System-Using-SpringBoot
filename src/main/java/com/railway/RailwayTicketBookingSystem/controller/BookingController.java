package com.railway.RailwayTicketBookingSystem.controller;

import com.railway.RailwayTicketBookingSystem.entity.Train;
import com.railway.RailwayTicketBookingSystem.service.TrainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookingController {
    private final TrainService trainService;

    public BookingController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping("/trains")
    public String viewTrains(Model model) {
        List<Train> trains = trainService.getAllTrains();
        model.addAttribute("trains", trains);
        return "trains";
    }
}
