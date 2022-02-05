package com.example.carTask.controller;

import com.example.carTask.Dto.CarDto;
import com.example.carTask.exceptions.EngineNotFoundException;
import com.example.carTask.model.Car;
import com.example.carTask.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/cars")
public class CarController {


    private final CarService carServices;
    private final ModelMapper modelMapper;
    @Autowired
    public CarController(CarService carServices, ModelMapper modelMapper) {
        this.carServices=carServices;
        this.modelMapper=modelMapper;
    }


    @PostMapping
    public CarDto createCar( @RequestBody CarDto newCar) {
        Car car = modelMapper.map(newCar, Car.class);
        Car createdCar = carServices.saveVehicle(car);
        return modelMapper.map(createdCar, CarDto.class);
    }

    @PutMapping("/update/{id}")
    ResponseEntity<CarDto> editCarById(@Valid @RequestBody CarDto CarDto, @PathVariable(value = "id") Long id) {
        Optional<Car> optionalCar = carServices.findById(id);
        if (optionalCar.isEmpty()) {
            throw new EngineNotFoundException(id);
        }

        Car car = modelMapper.map(CarDto, Car.class);
        Car editedCar = carServices.saveVehicle(car);
        CarDto mappedCar = modelMapper.map(editedCar, CarDto.class);
        return ResponseEntity.ok(mappedCar);
    }
    @GetMapping("/find/{id}")
    public CarDto getById(@PathVariable Long id) {
        Optional<Car> car = carServices.findById(id);
        return modelMapper.map(car, CarDto.class);
    }

    @GetMapping("/brand/{brand}")
    public List<CarDto> getCarsByBrand(@PathVariable String brand) {
        List<Car> cars = carServices.getByBrand(brand);
        List<CarDto> carDtos = new ArrayList<>();
        for (Car car : cars) {
            CarDto carDto = modelMapper.map(car, CarDto.class);
            carDtos.add(carDto);
        }
        return carDtos;
    }

    @GetMapping("/all")
    public Page<Car> getOwners(Pageable pageable){
        return carServices.getAll(pageable);
    }

    @GetMapping("/owner/{ownerId}")
    public List<CarDto>getByOwnerId(@PathVariable Long ownerId) {
        List<Car> cars = carServices.getByOwnerId(ownerId);
        List<CarDto> carDtos = new ArrayList<>();
        for (Car car : cars) {
            CarDto carDto = modelMapper.map(car, CarDto.class);
            carDtos.add(carDto);
        }
        return carDtos;
    }

}