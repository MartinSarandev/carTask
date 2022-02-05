package com.example.carTask.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Owner {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String dob;


}
