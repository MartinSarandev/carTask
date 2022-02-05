package com.example.carTask.service;

import com.example.carTask.model.Engine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EngineService {


    Engine saveEngine(Engine engine);

    Optional<Engine> getById(Long id);

    Page<Engine> getAll(Pageable pageable);


}
