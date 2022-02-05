package com.example.carTask.controller;

import com.example.carTask.Dto.OwnerDto;
import com.example.carTask.exceptions.OwnerNotFoundException;
import com.example.carTask.model.Owner;
import com.example.carTask.service.OwnerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;
    private ModelMapper modelMapper=new ModelMapper();


    @PostMapping
    ResponseEntity<OwnerDto> createOwner(@RequestBody OwnerDto newOwner) {
        Owner owner1=modelMapper.map(newOwner, Owner.class);
        OwnerDto mappedDto=modelMapper.map(ownerService.saveOwner(owner1), OwnerDto.class);
        return ResponseEntity.ok(mappedDto);
    }


    @GetMapping("/{id}")
    ResponseEntity<OwnerDto> findById(@PathVariable(value="id") Long id) {
        Optional<Owner> optionalOwner=ownerService.findById(id);
        if (optionalOwner.isEmpty()) {
            throw new OwnerNotFoundException(id);
        }
        OwnerDto mappedDto=modelMapper.map(optionalOwner.get(), OwnerDto.class);
        return ResponseEntity.ok(mappedDto);
    }

    @GetMapping("/all")
    public Page<Owner> getOwners(Pageable pageable){
        return ownerService.findAll(pageable);
    }


}




