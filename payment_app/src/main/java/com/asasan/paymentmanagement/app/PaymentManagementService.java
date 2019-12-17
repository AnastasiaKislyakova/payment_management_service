package com.asasan.paymentmanagement.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentManagementService {
    public static void main(String[] args) {
        SpringApplication.run(PaymentManagementService.class, args);
    }
}
