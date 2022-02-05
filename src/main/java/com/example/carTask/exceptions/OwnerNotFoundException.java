package com.example.carTask.exceptions;

public class OwnerNotFoundException extends RuntimeException{


    public OwnerNotFoundException(Long id) {
        super("Owner id not found" + id);
    }
}
