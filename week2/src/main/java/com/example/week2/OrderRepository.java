package com.example.week2;

public interface OrderRepository {
    Order findById(int id);
    void save(Order order);
}
