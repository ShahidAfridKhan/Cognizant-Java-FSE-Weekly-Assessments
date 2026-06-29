package com.example.week2;

public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public String process(int orderId) {
        Order order = repository.findById(orderId);
        if (order == null) {
            return "order not found";
        }
        order.setStatus("processed");
        repository.save(order);
        return "order processed";
    }
}
