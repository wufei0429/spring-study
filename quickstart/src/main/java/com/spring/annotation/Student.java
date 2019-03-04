package com.spring.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {
    @Value("小红")
    private String name;

    @Value("18")
    private int age;

    @Value("6666.66")
    private Phone price;

}
