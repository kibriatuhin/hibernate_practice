package com.example.hibernetpractice;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CLRunner implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("project start");
        SessionFactory sessionFactory = new Configuration().configure("hibernetconfg.xml").buildSessionFactory();
        System.out.println(sessionFactory);
    }
}
