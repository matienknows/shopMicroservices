package com.example.article.component.structure;


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

    private int port;

    public Article() {

    }

    public Article(String articleName, float price) {
        super();
        this.articleName = articleName;
        this.price = price;
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

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }


}
