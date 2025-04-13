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
public class PassageDTO {

    private int id;
    private int passageNumber;
    private String content;
    private List<QuestionDTO> questions;
}
