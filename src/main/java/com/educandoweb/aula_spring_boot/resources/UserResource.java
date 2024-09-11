package com.educandoweb.aula_spring_boot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.aula_spring_boot.entites.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Jonas Ramos", "jonas@gmail.com", "888888888", "123456");
		return ResponseEntity.ok().body(u);
	}
}
 