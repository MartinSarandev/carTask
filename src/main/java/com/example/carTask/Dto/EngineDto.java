package com.example.carTask.Dto;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import javax.validation.Constraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
public class EngineDto {

    @NotBlank
    private String engineNumber;
    @NotBlank
    private String  engineCapacity;
    @NotBlank
    private String horsePower;


}
