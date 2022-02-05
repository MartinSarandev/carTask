package com.example.carTask.repository;

import com.example.carTask.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> getByOwnerId(Long userId);

    Optional<Car> getByNumber(String number);


    @Query(value = "SELECT * FROM car WHERE car.engine_number = :engine_number", nativeQuery = true)
    Optional<Car> getByEngineNumber(@Param("engine_number") String engineNumber);

    List<Car> getByModel(String model);

    List<Car> getByBrand(String brand);

}
