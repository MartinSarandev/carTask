package com.example.carTask.service;

import com.example.carTask.model.Engine;
import com.example.carTask.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EngineServiceImpl implements EngineService {


    private final EngineRepository engineRepository;

    @Autowired
    public EngineServiceImpl(EngineRepository engineRepository) {
        this.engineRepository=engineRepository;
    }

    @Override
    public Engine saveEngine(Engine engine) {
        return engineRepository.save(engine);
    }

    @Override
    public Optional<Engine> getById(Long id) {
        return engineRepository.findById(id);
    }

    @Override
    public Page<Engine> getAll(Pageable pageable) {
        return engineRepository.findAll(pageable);
    }
}
