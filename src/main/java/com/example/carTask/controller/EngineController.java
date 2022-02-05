package com.example.carTask.controller;

import com.example.carTask.Dto.EngineDto;
import com.example.carTask.exceptions.EngineNotFoundException;
import com.example.carTask.model.Engine;
import com.example.carTask.service.EngineService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/engines")
public class EngineController {


    private final EngineService engineService;
    private final ModelMapper modelMapper;

    @Autowired
    public EngineController(EngineService engineService, ModelMapper modelMapper) {
        this.engineService=engineService;
        this.modelMapper=modelMapper;
    }

    @PostMapping
    ResponseEntity<EngineDto> addEngine ( @RequestBody EngineDto newEngine){
        Engine engine = modelMapper.map(newEngine, Engine.class);
        EngineDto mappedEngine = modelMapper.map(engineService.saveEngine(engine), EngineDto.class);
        return ResponseEntity.ok(mappedEngine);
    }


    @GetMapping("/{id}")
    ResponseEntity<EngineDto> findByEngineId (@PathVariable Long id){
        Optional<Engine> optionalEngine = engineService.getById(id);
        if (optionalEngine.isEmpty()){
            throw new EngineNotFoundException(id);
        }
        EngineDto mappedDto = modelMapper.map(optionalEngine.get(), EngineDto.class);
        return ResponseEntity.ok(mappedDto);
    }

    @GetMapping("/all")
    public Page<Engine> getOwners(Pageable pageable){
        return engineService.getAll(pageable);
    }


}
