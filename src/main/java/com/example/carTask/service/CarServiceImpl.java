package com.example.carTask.service;

import com.example.carTask.model.Car;
import com.example.carTask.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {


    private  final CarRepository carRepository;
    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository=carRepository;
    }



    @Override
    public Car saveVehicle(Car car) {
        return carRepository.save(car);
    }
    @Override
    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public List<Car> getByBrand(String brand) {
        return carRepository.getByBrand(brand);
    }

    @Override
    public Page<Car> getAll(Pageable pageable) {
        return carRepository.findAll(pageable);
    }

    @Override
    public List<Car> getByOwnerId(Long ownerId) {
        return carRepository.getByOwnerId(ownerId);
    }
}
