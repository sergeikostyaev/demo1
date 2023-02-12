package com.example.demo.course.hibernate;

import com.example.demo.course.hibernate.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test5 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee e = session.get(Employee.class, 1);

//            session.createQuery("delete Employee  where id = 1").executeUpdate();

            session.createQuery("delete Employee  where name = 'Alexander'").executeUpdate();











            session.getTransaction().commit();
            System.out.println("\n \n \n \n \n \n DONE \n \n \n \n \n \n ");


        }finally {
            factory.close();
        }

    }
}