package com.example.demo.course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");


        Dog dog = context.getBean("dogBean",Dog.class);
        dog.say();
        Dog dog1 = context.getBean("dogBean",Dog.class);
        dog1.say();
        Person person = context.getBean("personBean",Person.class);
        System.out.println(person.getSurname());
        person.callPet();



        context.close();

    }
}
