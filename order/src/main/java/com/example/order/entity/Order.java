package com.example.order.entity;

import javax.persistence.*;


@Entity
@Table(name="ORDER")
public class Order {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="title")
    private String title;

    public Order(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
