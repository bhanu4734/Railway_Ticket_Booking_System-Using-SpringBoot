package com.railway.RailwayTicketBookingSystem.service;

import com.railway.RailwayTicketBookingSystem.entity.Booking;
import com.railway.RailwayTicketBookingSystem.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
}
