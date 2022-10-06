package com.example.hibernetpractice;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernetPracticeApplication {

    public static void main(String[] args) {
       // SpringApplication.run(HibernetPracticeApplication.class,args);
       // System.exit(0);
        System.out.println("project start");
        SessionFactory sessionFactory = new Configuration().configure("hibernetconfg.xml").buildSessionFactory();
        System.out.println(sessionFactory);

    }

}
