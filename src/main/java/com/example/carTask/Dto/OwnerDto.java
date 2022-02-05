package com.example.carTask.Dto;


import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class OwnerDto {

    @Size(min=2,message="Too short")
    private String firstName;
    @NotBlank
    private String lastName;

//    @Pattern(regexp = "^(19|20)\\d\\d([- /.])(0[1-9]|1[012])\\2(0[1-9]|[12][0-9]|3[01])$")
//    @NotEmpty(message="use  1999-01-01  format")
    private String dob;
}
