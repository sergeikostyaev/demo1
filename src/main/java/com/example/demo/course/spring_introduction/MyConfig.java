package com.example.demo.course.spring_introduction;


import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.example.demo.course.spring_introduction")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Cat catBean(){
        return new Cat();
    }

    @Bean("dogBean")
    public Dog dogBean(){
        return new Dog();
    }

    @Bean
    public Person personBean(){
        return new Person();
    }


}
