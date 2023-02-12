package com.example.demo.course.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book", Book.class);
        UniLibrary l = context.getBean("uniLibrary", UniLibrary.class);
        System.out.println(" ");
        l.getBook();

        l.addBook("Sergei",book);
        l.addMagazine();











    }
}
