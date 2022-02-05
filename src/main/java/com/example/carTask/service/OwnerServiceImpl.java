package com.example.carTask.service;

import com.example.carTask.model.Owner;
import com.example.carTask.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService{


    private  final OwnerRepository ownerRepository;

    @Autowired
    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository=ownerRepository;}




    @Override
    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Optional<Owner> findById(Long id) {
       return ownerRepository.findById(id);
    }

    @Override
    public Page<Owner> findAll(Pageable pageable) {
        return ownerRepository.findAll(pageable);
    }

}
