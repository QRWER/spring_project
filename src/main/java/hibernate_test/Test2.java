package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                                            .configure("hibernate.cfg.xml")
                                            .addAnnotatedClass(Employee.class)
                                            .buildSessionFactory();
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Employee emp = new Employee("Oleg", "Sidorov", "HR", 700);
            session.save(emp);
//            session.getTransaction().commit();

            int myId = emp.getId();

//            session = sessionFactory.openSession();
//            session.beginTransaction();
            Employee emp2 = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(emp2);

        } finally {
            sessionFactory.close();
        }
    }
}
