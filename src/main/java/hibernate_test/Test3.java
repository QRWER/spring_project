package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> employees = session.createQuery("from Employee " + "where name = 'Alex' and salary > 1000    ")
                    .getResultList();

            for(Employee emp : employees){
                System.out.println(emp);
            }

            session.getTransaction().commit();

            System.out.println("Done");
        }finally{factory.close();}
    }
}
