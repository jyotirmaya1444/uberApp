package com.uber.uberApp.strategies;

import com.uber.uberApp.dto.RideRequestDTO;

public interface RiderFareCalculationStrategy {
    double calculateFare(RideRequestDTO rideRequestDTO);
}
