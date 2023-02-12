package com.example.demo.course.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {


    @Around("execution(public String returnBook())")
    public String aroundReturnLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnLoggingAdvice: trying return  book");

        String res = (String)proceedingJoinPoint.proceed();

        System.out.println("aroundReturnLoggingAdvice: returned book");

        return res;
    }


}
