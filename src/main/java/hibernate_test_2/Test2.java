package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = sessionFactory.openSession();
//            Employee employee = new Employee("Nikolay", "Ivanov", "HR", 850);
//            Detail detail = new Detail("New-York", "12544252", "email4@gmail.com");
//            detail.setEmployee(employee);
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");

//            session = sessionFactory.openSession();
//
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail.getEmployee());
//            session.getTransaction().commit();

            session = sessionFactory.openSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();


            System.out.println("Done");

        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
