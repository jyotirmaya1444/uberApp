package com.uber.uberApp.dto;

import com.uber.uberApp.entities.enums.PaymentMethod;
import com.uber.uberApp.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDTO {

    private Long id;
    private RiderDTO riderDTO;
    private Point pickupLocation, dropOffLocation;
    private LocalDateTime createdDate, modifiedDate;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;
    private Double fare;
}
