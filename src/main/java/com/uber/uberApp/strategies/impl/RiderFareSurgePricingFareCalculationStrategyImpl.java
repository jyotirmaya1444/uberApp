package com.uber.uberApp.strategies.impl;

import com.uber.uberApp.dto.RideRequestDTO;
import com.uber.uberApp.strategies.RiderFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RiderFareSurgePricingFareCalculationStrategyImpl implements RiderFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0;
    }
}
