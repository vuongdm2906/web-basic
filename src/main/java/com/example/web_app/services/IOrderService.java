package com.example.web_app.services;

import com.example.web_app.dtos.OrderDTO;
import com.example.web_app.exceptions.DataNotFoundException;
import com.example.web_app.models.Order;

import java.util.List;

public interface IOrderService {
    Order createOrder(OrderDTO orderDTO) throws Exception;
    Order getOrder(Long id);
    Order updateOrder(Long id, OrderDTO orderDTO) throws DataNotFoundException;
    void deleteOrder(Long id);
    List<Order> findByUserId(Long userId);
}
