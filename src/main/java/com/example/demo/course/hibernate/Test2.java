package com.example.demo.course.hibernate;

import com.example.demo.course.hibernate.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Oleg", "Sidorov", "HR", 700);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();

            int id = emp.getId();

//            session = factory.getCurrentSession();
//            session.beginTransaction();


            Employee employee = session.get(Employee.class, id);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(employee);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            session.getTransaction().commit();


        }finally {
            factory.close();
        }






    }
}
