package com.uber.uberApp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity(name = "driver")
@Table(name = "driver")
@Getter
@Setter
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column(name = "rating", nullable = false)
    private Double rating;

    @Column(name = "isActive", nullable = false)
    private Boolean active;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point currentLocation;
}
