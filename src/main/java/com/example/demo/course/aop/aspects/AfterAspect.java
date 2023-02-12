package com.example.demo.course.aop.aspects;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1000)
public class AfterAspect {
    @After("com.example.demo.course.aop.aspects.MyPointcuts.allMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("---------------------------------------");
    }
}
