package com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dsdeliver.dto.OrderDTO;

import com.devsuperior.dsdeliver.entities.Order;

import com.devsuperior.dsdeliver.repositories.OrderRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll(){
        List<Order>list = repository.findOrdersWithProduts();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
}
}