package com.example.demozoo.domain;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private int total_no;



    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Animal() {
    }
    public Animal(String type,int total_no){
        this.type = type;
        this.total_no = total_no;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public int getTotal_no() {
        return total_no;
    }

    public void setTotal_no(int total_no) {
        this.total_no = total_no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
