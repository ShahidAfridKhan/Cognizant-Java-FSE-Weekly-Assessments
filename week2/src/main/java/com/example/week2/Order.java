package com.example.week2;

public class Order {
    private final int id;
    private String status;

    public Order(int id) {
        this.id = id;
        this.status = "new";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
