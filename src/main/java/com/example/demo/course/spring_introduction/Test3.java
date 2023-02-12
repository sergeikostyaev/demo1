package com.example.demo.course.spring_introduction;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person p = context.getBean("myPerson",Person.class);
        p.callPet();
        System.out.println(p.getSurname());
        System.out.println(p.getAge());



        context.close();
    }
}
