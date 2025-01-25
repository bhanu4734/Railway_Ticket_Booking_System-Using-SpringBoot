package com.railway.RailwayTicketBookingSystem.repository;

import com.railway.RailwayTicketBookingSystem.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
