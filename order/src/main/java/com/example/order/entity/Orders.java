package com.example.order.entity;


import javax.persistence.*;


@Entity
@Table(name="orders")
public class Orders {

    @Id
    @GeneratedValue
    @Column(name="order_id")
    private int orderId;

    @Column(name="customer_id")
    private int customerId;

    public Orders(){

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomer() {
        return customerId;
    }

    public void setCustomer(int customer) {
        this.customerId = customerId;
    }
}
