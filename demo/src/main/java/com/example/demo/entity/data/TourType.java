package com.example.demo.entity.data;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tour_types")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TourType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String typeName;
}