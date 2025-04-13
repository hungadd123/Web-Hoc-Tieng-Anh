package com.example.demo.entity.data;

import com.example.demo.entity.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name="tour_orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class TourOrder {
    @Id
    @GeneratedValue
    private long id;
    private int numberOfParticipants;
    private LocalDateTime createdAt;
    private double totalPrice;
    private String notes;
    private String phoneNumber;
    private boolean isPayed=false;
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    @JsonIgnore
    private User user;
    @ManyToOne(fetch= FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "tour_id",nullable = false)
    private Tour tour;
}
