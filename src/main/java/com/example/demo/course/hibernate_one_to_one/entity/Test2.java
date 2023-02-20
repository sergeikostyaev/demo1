package com.example.demo.course.hibernate_one_to_one.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            Detail d = session.get(Detail.class, 4);

            session.delete(d);






            session.getTransaction().commit();
            System.out.println("done");
        }finally {
            session.close();
            factory.close();
        }






    }
}
