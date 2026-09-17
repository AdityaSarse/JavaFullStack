package example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

//        Student std = new Student();

//        std.setSid(3);
//        std.setSname("Ashish");
//        std.setTech("java");

        Configuration config = new Configuration();

        config.addAnnotatedClass(Student.class);

        SessionFactory factory =
                config.configure().buildSessionFactory();

        Session session = factory.openSession();

//        Transaction transaction = session.beginTransaction();

        Student std =session.find(Student.class,3);

//        transaction.commit();

        System.out.println(std);

        session.close();
        factory.close();
    }
}