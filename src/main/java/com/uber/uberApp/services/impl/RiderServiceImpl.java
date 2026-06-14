package com.uber.uberApp.services.impl;

import com.uber.uberApp.dto.RideDTO;
import com.uber.uberApp.dto.RideRequestDTO;
import com.uber.uberApp.services.RiderService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {

    @Override
    public RideDTO cancelRides(Long rideId) {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return List.of();
    }

    @Override
    public RideDTO getMyProfile() {
        return null;
    }

    @Override
    public RideDTO onboardRider(Long userId) {
        return null;
    }

    @Override
    public RideDTO rateDriver(Long rideId, double rating) {
        return null;
    }

    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
        return null;
    }
}
