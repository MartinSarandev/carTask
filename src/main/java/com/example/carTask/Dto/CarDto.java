package com.example.carTask.Dto;

import com.example.carTask.model.Engine;
import com.example.carTask.model.Owner;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Constraint;
import javax.validation.constraints.*;


@Data
public class CarDto {

    private Owner ownerDto;
    @NotNull
    private EngineDto engineDto;
    private String brand;
    @NotNull
    private String model;
    private Long productionYear;
    @NotBlank
    private String number;


}
