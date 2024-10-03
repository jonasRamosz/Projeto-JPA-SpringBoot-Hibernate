package com.educandoweb.aula_spring_boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.aula_spring_boot.entites.Order;
import com.educandoweb.aula_spring_boot.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long Id){
		Optional<Order> order = repository.findById(Id);
		return order.get();
	}
}
