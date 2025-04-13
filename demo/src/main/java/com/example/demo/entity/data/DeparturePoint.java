package com.example.demo.entity.data;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departure_points")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeparturePoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pointName;
    // (Thay vì vehicleName, vì departurePoint là địa điểm xuất phát)
}