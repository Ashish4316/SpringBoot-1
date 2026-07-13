package com.example.demo.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    PaymentService paymentService;
    public  void placeOrder(){
        paymentService.payment();
        System.out.println("Order Placed");
    }
}
