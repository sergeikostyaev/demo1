package com.example.demo.course.spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{

    private String name;


    @Override
    public void say() {
        System.out.println("bow-wow");
    }



//    @PostConstruct
//    public void init(){
//        System.out.println("Dog init");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Dog destroy");
//    }

}
