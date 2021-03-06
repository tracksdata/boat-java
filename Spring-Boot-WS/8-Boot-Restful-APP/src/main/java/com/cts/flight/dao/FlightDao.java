package com.cts.flight.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.flight.entity.Flight;

public interface FlightDao extends JpaRepository<Flight, Integer> {

	List<Flight> findFlightByOriginAndDestinationAndFlightDate(String origin,String destination,LocalDate flightDate);
	Flight findByFlightNumberAndOriginAndDestinationAndFlightDate(String flightNumber,String origin,String destination,LocalDate fliightDate);
}