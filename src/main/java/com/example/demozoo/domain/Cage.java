package com.example.demozoo.domain;

import javax.persistence.*;

@Entity
public class Cage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cage_no;
    private String location;

    @OneToOne
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Cage() {
    }
    public Cage(String cage_no,String location){
        this.cage_no = cage_no;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCage_no() {
        return cage_no;
    }

    public void setCage_no(String cage_no) {
        this.cage_no = cage_no;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
