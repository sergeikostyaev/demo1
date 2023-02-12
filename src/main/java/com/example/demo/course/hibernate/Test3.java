package com.example.demo.course.hibernate;

import com.example.demo.course.hibernate.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> emps = session.createQuery("from Employee").getResultList();
            List<Employee> emps = session.createQuery("from Employee  where name = 'Alexander' and salary > 650").getResultList();

            System.out.println("\n \n \n \n \n \n " + emps + " \n \n \n \n \n \n ");






            session.getTransaction().commit();
            System.out.println("\n \n \n \n \n \n DONE \n \n \n \n \n \n ");


        }finally {
            factory.close();
        }






    }
}
