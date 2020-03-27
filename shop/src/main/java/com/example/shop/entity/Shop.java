package com.example.shop.entity;

public class Shop {

    private int articleid;
    private String articleName;
    private float price;
    private int customerId;
    private int orderId;
    private int port;
    public Shop(){

    }

    public Shop(int articleid, String articleName, float price, int port) {
        super();
        this.articleid = articleid;
        this.articleName = articleName;
        this.price = price;
        this.port = port;
    }

    public int getArticleid() {
        return articleid;
    }

    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
