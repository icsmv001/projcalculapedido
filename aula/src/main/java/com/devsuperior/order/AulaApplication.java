package com.devsuperior.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.order.entities.Employee;
import com.devsuperior.order.entities.Order;
import com.devsuperior.order.services.OrderService;
import com.devsuperior.order.services.SalaryService;
@SpringBootApplication

//@ComponentScan({"com.devsuperior"})


public class AulaApplication  implements CommandLineRunner {
	
	@Autowired
	private SalaryService salaryService;
	
	@Autowired
	private OrderService orderService;
	
	
	public static void main(String[] args){
    	SpringApplication.run(AulaApplication.class, args); 
	}

	@Override
	public void run(String... args) throws Exception {
		//exemplo aula 00 - exemplo/modelo
		//Employee employee = new Employee("Maria",  40000.00);
		//System.out.println(salaryService.netSalary(employee));
		
		
		
		//DESAFIO Componentes e injecao de dependencias (icsmv001 - izael.)
		Order order = new Order(1309,95.90, 00.00);
		
		System.out.println("------------------------------------");
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor Total..: " + orderService.TotalOrder(order));
		System.out.println("------------------------------------");		
		
			
	}
		
}


