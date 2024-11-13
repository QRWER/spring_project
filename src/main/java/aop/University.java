package aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudent(){
        Student student1 = new Student("Shkaley Ilya", 3, 4.8);
        Student student2 = new Student("Ivanov Mihail", 2, 3.4);
        Student student3 = new Student("Sidorova Elena", 1, 5);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents");
        //System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
