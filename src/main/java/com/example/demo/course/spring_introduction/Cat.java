package com.example.demo.course.spring_introduction;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("mew");
    }
}
