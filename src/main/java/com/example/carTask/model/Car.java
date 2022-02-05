package com.example.carTask.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Data
@Entity
//@Table(name = "cars", uniqueConstraints = {@UniqueConstraint(columnNames = {"engine_id"})})
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch=FetchType.EAGER,targetEntity=Engine.class)
    @JoinColumn(name = "engine_id",referencedColumnName = "id")
    private Engine engine;

    @ManyToOne(fetch=FetchType.EAGER,targetEntity=Owner.class)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    private String brand;
    private String model;
    private Long productionYear;

    @NotNull
    @Column(unique=true)
    private String number;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", engine=" + engine +
                ", owner=" + owner +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", number='" + number + '\'' +
                '}';
    }
    //    public Car() {
//    }
//
//    public Car(Engine engine, Owner owner, String brand, String model, Long productionYear, String number) {
//        this.engine=engine;
//        this.owner=owner;
//        this.brand=brand;
//        this.model=model;
//        this.productionYear=productionYear;
//        this.number=number;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "id=" + id +
//                ", engine=" + engine +
//                ", owner=" + owner +
//                ", brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", productionYear=" + productionYear +
//                ", number='" + number + '\'' +
//                '}';
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id=id;
//    }
//
//    public Engine getEngine() {
//        return engine;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine=engine;
//    }
//
//    public Owner getOwner() {
//        return owner;
//    }
//
//    public void setOwner(Owner owner) {
//        this.owner=owner;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand=brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model=model;
//    }
//
//    public Long getProductionYear() {
//        return productionYear;
//    }
//
//    public void setProductionYear(Long productionYear) {
//        this.productionYear=productionYear;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public void setNumber(String number) {
//        this.number=number;
//    }
}
