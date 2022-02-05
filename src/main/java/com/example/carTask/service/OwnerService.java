package com.example.carTask.service;

import com.example.carTask.model.Owner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface OwnerService {

    Owner saveOwner(Owner owner);
    Optional<Owner> findById(Long id);
    Page<Owner> findAll(Pageable pageable);

}
