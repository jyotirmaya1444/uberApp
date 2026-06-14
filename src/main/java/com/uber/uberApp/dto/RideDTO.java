package com.uber.uberApp.dto;


import com.uber.uberApp.entities.enums.PaymentMethod;
import com.uber.uberApp.entities.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDTO {
    private Long id;
    private RiderDTO riderDTO;
    private DriverDTO driverDTO;
    private Point pickupLocation, dropOffLocation;
    private LocalDateTime createdDate, modifiedDate;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startAt, endAt;
    private String otp;
}
