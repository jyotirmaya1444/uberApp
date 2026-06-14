package com.uber.uberApp.services;

import com.uber.uberApp.dto.DriverDTO;
import com.uber.uberApp.dto.RideDTO;

import java.util.List;

public interface DriverService {


    RideDTO cancelRides(Long rideId);

    RideDTO endRide(Long rideId);

    List<RideDTO> getAllMyRides();

    DriverDTO getMyProfile();

    DriverDTO onboardDriver(Long userId);

    RideDTO startRide(Long rideId);

    RideDTO rateRider(Long rideId, double rating);
}
