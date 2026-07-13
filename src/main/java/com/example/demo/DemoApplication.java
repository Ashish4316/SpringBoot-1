package com.example.demo;

import com.example.demo.DependencyInjection.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class,args);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
		SpringApplication.run(DemoApplication.class, args);
	}

}
