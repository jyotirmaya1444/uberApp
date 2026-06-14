package com.uber.uberApp.strategies;

import com.uber.uberApp.dto.RideRequestDTO;
import com.uber.uberApp.entities.Driver;
import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO);
}
