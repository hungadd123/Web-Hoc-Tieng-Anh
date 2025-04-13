package com.example.demo.controller.PrivateController;

import com.example.demo.dto.LessonDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SectionDTO {
    private Integer id;

    @NotBlank(message = "Section name is mandatory")
    @Size(max = 255, message = "Section name can have at most 255 characters")
    private String name;

    private Integer courseId; // Sử dụng Integer để khớp với Course.id

    private List<LessonDTO> lessons;
}
