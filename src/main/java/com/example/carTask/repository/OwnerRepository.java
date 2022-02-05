package com.example.carTask.repository;

import com.example.carTask.model.Owner;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    List<Owner> findByFirstName(String firstName);

    @Query(value="select * from Owner o WHERE o.firstName = :name",nativeQuery=true)
    Optional<Owner> findByName (@Param("name") String name);


}
