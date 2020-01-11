package com.example.demozoo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FootItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int quantity;

    @ManyToMany
    private List<Animal> animals = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Supplier supplier;


    public FootItems(){}
    public FootItems(String name,int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
