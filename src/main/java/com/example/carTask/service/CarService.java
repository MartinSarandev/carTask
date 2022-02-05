package com.example.carTask.service;


//- търсене на автомобил по номер
//        - търсене по марка и модел
//        - търсене по собственик
//        - търсене по номер на двигател

import com.example.carTask.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CarService {

    Car saveVehicle(Car car);
    List<Car> getByBrand(String brand);
    Optional<Car> findById(Long id);
    Page<Car> getAll(Pageable pageable);
    List<Car> getByOwnerId(Long ownerId);


}
