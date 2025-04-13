package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO {

    private int id;
    private String title;
    private String type;
    private List<PassageDTO> passages; // For Reading Test
    private List<ListeningSectionDTO> listeningSections; // For Listening TestTest
}
