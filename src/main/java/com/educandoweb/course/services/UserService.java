package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service//registrando como componente do spring
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		
		return repository.findAll();	
	}

	public User findById(Long id) {
		// TODO Auto-generated method stub
		Optional<User> obj =  repository.findById(id);
		return obj.get();
	}
	
}
