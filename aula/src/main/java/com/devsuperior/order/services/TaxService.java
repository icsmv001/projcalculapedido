package com.devsuperior.order.services;

import org.springframework.stereotype.Service;

import com.devsuperior.order.entities.Employee;

@Service
public class TaxService {
	
	public double tax(double amount) {return amount * 0.2 ; }
}
