package com.example.demo.course.hibernate_one_to_many_bi;

import com.example.demo.course.hibernate_one_to_one.entity.Detail;
import com.example.demo.course.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Zaur", "Tregulov", "IT", 500);
//            Detail detail = new Detail("Baku","12346454","zaurtgerulob@gmail.com");
//            emp.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(emp);

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 1);
            emp.getEmpDetail().setEmail("newemail@mail.ru");






            session.getTransaction().commit();
            System.out.println("done");
        }finally {
            session.close();
            factory.close();
        }






    }
}

