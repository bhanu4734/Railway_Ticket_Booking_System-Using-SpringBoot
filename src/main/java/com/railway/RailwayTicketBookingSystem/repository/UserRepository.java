package com.railway.RailwayTicketBookingSystem.repository;

import com.railway.RailwayTicketBookingSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
