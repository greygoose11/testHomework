package com.example.testHomework;

import com.example.testHomework.model.Person;
import com.example.testHomework.model.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        GsonParser parser = new GsonParser();
        Root root = parser.parse();

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Root.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();

        System.out.println(root.toString());
        session.save(root);
        List<Person> personList = root.getPersonList();
        for (Person p: personList){
            session.save(p);
        }
        session.getTransaction().commit();
        session.close();
    }
}
