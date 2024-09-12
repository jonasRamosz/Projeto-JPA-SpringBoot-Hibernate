package com.educandoweb.aula_spring_boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.aula_spring_boot.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
