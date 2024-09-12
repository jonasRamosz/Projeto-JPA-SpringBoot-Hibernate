package com.educandoweb.aula_spring_boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.aula_spring_boot.entites.User;
import com.educandoweb.aula_spring_boot.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long Id){
		Optional<User> user = repository.findById(Id);
		return user.get();
	}
}
