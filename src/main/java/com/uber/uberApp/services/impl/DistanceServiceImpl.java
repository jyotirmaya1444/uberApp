package com.uber.uberApp.services.impl;

import com.uber.uberApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {
    @Override
    public double calculateDistance(Point startPoint, Point endPoint) {
        return 0;
    }
}
