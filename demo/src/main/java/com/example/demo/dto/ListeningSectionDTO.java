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
public class ListeningSectionDTO {

    private int id;
    private int sectionNumber;
    private String audioUrl;
    private String transcript;
    private List<QuestionDTO> questions;
}
