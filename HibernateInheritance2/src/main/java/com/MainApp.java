package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainApp {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
            System.out.println("Enter id,name");
            int id=Integer.parseInt(br.readLine());
            String name=br.readLine();
            Student stu=new Student();
            stu.setId(id);
            stu.setName(name);
            System.out.println("Enter Vehicles & No. of Hours");
            int vehicle=Integer.parseInt(br.readLine());
            int hours=Integer.parseInt(br.readLine());
            DayScholar dstu=new DayScholar();
            dstu.setVehicle(vehicle);
            dstu.setNo_of_hrs(hours);
            System.out.println("Enter for Hosteller");
            int hours1=Integer.parseInt(br.readLine());
            Hosteller hstu=new Hosteller();
            hstu.setNo_of_hrs(hours1);
            session.save(stu);
            session.save(dstu);
            session.save(hstu);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
