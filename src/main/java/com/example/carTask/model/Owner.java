package com.example.carTask.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Owner {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String dob;


}
