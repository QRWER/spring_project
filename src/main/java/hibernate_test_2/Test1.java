package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
//            Session session = sessionFactory.getCurrentSession();
//            Employee employee = new Employee("Ilya", "Shkaley", "IT", 500);
//            Detail detail = new Detail("Baku", "123123", "email@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");

//            Session session = sessionFactory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Moscow", "1234111", "email2@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");

//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 10);
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();

            System.out.println("Done");

        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
