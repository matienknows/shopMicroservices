package com.example.article.entity;


import javax.persistence.*;

@Entity
@Table(name="Article")
public class Article {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="name")
    private String articleName;

    @Column(name="price")
    private float price;


    public Article() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
