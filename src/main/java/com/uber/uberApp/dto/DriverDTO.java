package com.uber.uberApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO {
    private Long id;
    private UserDTO userDTO;
    private Double rating;
    private Boolean active;
    private Point currentLocation;
}
