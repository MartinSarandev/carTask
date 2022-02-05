package com.example.carTask.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"engineNumber"})})
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="engineNumber")
    private String engineNumber;
    private String engineCapacity;
    private String horsePower;


}
