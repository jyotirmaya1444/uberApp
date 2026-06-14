package com.uber.uberApp.services.impl;

import com.uber.uberApp.dto.DriverDTO;
import com.uber.uberApp.dto.RideDTO;
import com.uber.uberApp.services.DriverService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DriverServiceImple implements DriverService {

    @Override
    public RideDTO cancelRides(Long rideId) {
        return null;
    }

    @Override
    public RideDTO endRide(Long rideId) {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return List.of();
    }

    @Override
    public DriverDTO getMyProfile() {
        return null;
    }

    @Override
    public DriverDTO onboardDriver(Long userId) {
        return null;
    }

    @Override
    public RideDTO startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO rateRider(Long rideId, double rating) {
        return null;
    }
}
