package com.learn.cardatabase.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.learn.cardatabase.domain.Car;

@Service
public class CarService {
	
	@PreAuthorize("hasRole('USER')")
	public void updateCar(Car car) {
		
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	public void deleteOwner(Car car) {
		
	}
}
