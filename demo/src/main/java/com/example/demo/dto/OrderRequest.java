package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderRequest {
    private Long tourId;
    private int userId;
    private int numberOfParticipants;
    private String phoneNumber;
    private String notes;
}
