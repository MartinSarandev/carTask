package com.example.carTask.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@NoArgsConstructor
@Getter
@Setter
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
