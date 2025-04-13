package com.example.demo.entity.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tours")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Tour name cannot be blank")
    private String tourName;

    @NotNull(message = "Departure date is required")
    private LocalDateTime departureDate;

    @NotNull(message = "End date is required")
    private LocalDateTime endDate;

    // Dựa trên departureDate - endDate, bạn có thể tự tính,
    // hoặc cho phép nhập tay
    private int numberOfDays;
    private int numberOfNights;

    @Min(value = 1, message = "maxQuantity must be >= 1")
    private int maxQuantity;

    private int numberOfBooked; // Mặc định = 0 khi mới tạo

    @Min(value = 0, message = "Price must be >= 0")
    private double price;

    // URL hoặc đường dẫn ảnh
    private String thumbnail;

    // ManyToOne: Mỗi Tour gắn với 1 departurePoint
    @ManyToOne
    @JoinColumn(name = "departure_point_id", nullable = false)
    private DeparturePoint departurePoint;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "tour_type_id", nullable = false)
    private TourType tourType;
}