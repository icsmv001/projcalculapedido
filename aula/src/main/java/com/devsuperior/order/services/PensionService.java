package com.devsuperior.order.services;

import org.springframework.stereotype.Service;

import com.devsuperior.order.entities.Employee;

@Service
public class PensionService {
	
	public double discount(double amount) { return amount * 0.1 ; }
	
}
