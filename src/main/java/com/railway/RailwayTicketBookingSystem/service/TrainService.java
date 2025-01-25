package com.railway.RailwayTicketBookingSystem.service;

import com.railway.RailwayTicketBookingSystem.entity.Train;
import com.railway.RailwayTicketBookingSystem.repository.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    private final TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }
}
