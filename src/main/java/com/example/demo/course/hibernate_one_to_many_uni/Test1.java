package com.example.demo.course.hibernate_one_to_many_uni;

import com.example.demo.course.hibernate_one_to_many_bi.entity.Department;
import com.example.demo.course.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {


        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
//            Department dep = new Department("IT",300,1200);
//            Employee emp1 = new Employee("Zaur","Tregulov",800);
//            Employee emp2 = new Employee("Elena","Smirnova",1000);
//
//            dep.addEmployee(emp1);
//            dep.addEmployee(emp2);
//
//            session.save(dep);
//
//
//
//
//
//
//            session.getTransaction().commit();
//            System.out.println("done");


            Department department = session.get(Department.class, 1);



            session.delete(department.getEmps().get(1));



            session.getTransaction().commit();
            System.out.println("done");




        } finally {
            session.close();
            factory.close();
        }


    }
}