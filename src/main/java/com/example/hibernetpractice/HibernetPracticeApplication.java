package com.example.hibernetpractice;

import com.example.hibernetpractice.model.Address;
import com.example.hibernetpractice.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

@SpringBootApplication
public class HibernetPracticeApplication {

    public static void main(String[] args) throws IOException {

        SessionFactory sessionFactory = new Configuration().configure("hibernetconfg.xml").buildSessionFactory();
        System.out.println(sessionFactory);

        //create student object
        Student student = new Student();
        student.setId(109);
        student.setName("Golam Kibria tuhin");
        student.setCity("Tangail");
        System.out.println(student);

        //create address object

        Address address = new Address();
        address.setStreetNo(1088);
        address.setCity("Tangail");
        address.setAddDate(new Date());
        address.setCheck(22);

        //reading file
        FileInputStream fileInputStream = new FileInputStream("E:/test.jpg");
        byte[] data = new byte[fileInputStream.available()];
        fileInputStream.read(data);
        address.setImage(data);

        //creating session
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        session.save(address);
        transaction.commit();
        session.close();
        System.out.println("done my work....");

    }

}
