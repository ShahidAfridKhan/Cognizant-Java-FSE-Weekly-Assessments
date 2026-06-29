package com.example.week2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class OrderServiceTest {
    @Mock
    private OrderRepository repository;

    private OrderService service;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        service = new OrderService(repository);
    }

    @Test
    void testProcessOrder() {
        Order order = new Order(1);
        when(repository.findById(1)).thenReturn(order);

        String result = service.process(1);

        assertEquals("order processed", result);
        verify(repository).save(order);
    }
}
