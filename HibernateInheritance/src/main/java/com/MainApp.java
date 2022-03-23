package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        try {
         Configuration configuration=new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
            Student stu = new Student(1, "ak");
            DayScholar dstu = new DayScholar(34, "st", 1, 6);
            Hosteller hstu = new Hosteller(2, "kk", 10);
            session.save(stu);
            session.save(dstu);
            session.save(hstu);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
