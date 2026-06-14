package com.uber.uberApp.services;

import com.uber.uberApp.dto.RideDTO;
import com.uber.uberApp.dto.RideRequestDTO;

import java.util.List;

public interface RiderService {

    RideDTO cancelRides(Long rideId);

    List<RideDTO> getAllMyRides();

    RideDTO getMyProfile();

    RideDTO onboardRider(Long userId);

    RideDTO rateDriver(Long rideId, double rating);

    RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);
}
