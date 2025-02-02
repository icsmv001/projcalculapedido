package com.devsuperior.order.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.order.entities.Employee;
import com.devsuperior.order.entities.Order;
 
@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	 
	
	  public double TotalOrder(Order order) {
		  return order.getBasic() -( order.getBasic() * order.getDiscount()/100)+shippingService.shipment(order.getBasic());
			  
 

	  
	  }
	 
}