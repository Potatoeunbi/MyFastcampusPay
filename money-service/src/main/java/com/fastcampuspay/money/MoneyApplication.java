package com.fastcampuspay.money;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class MoneyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoneyApplication.class, args);
    }
}
