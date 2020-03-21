package com.example.article.entity;


import javax.persistence.*;

@Entity
@Table(name="article")
public class Article {

    @Id
    @GeneratedValue
    private int articleId;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private float price;


    public Article() {

    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
