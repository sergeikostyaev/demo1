package com.example.demo.course.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* add*(..))") public void allAddMethods(){}


    @Pointcut("execution(* com.example.demo.course.aop.UniLibrary.*(..))") public void allMethods(){}








}
