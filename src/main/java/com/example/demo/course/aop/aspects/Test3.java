package com.example.demo.course.aop.aspects;

import com.example.demo.course.aop.MyConfig;
import com.example.demo.course.aop.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary",UniLibrary.class);
        String bookname = uniLibrary.returnBook();
        System.out.println(bookname);




         context.close();
        System.out.println("main ends");
    }
}


