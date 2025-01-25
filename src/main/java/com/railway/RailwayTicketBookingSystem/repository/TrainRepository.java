package com.railway.RailwayTicketBookingSystem.repository;

import com.railway.RailwayTicketBookingSystem.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Long> {
}
