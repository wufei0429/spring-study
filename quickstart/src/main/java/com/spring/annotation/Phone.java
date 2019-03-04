package com.spring.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Phone {
    @Value("iPhone")
    private String brand;

    @Value("6666.66")
    private double price;
}
