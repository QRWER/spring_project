package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: Логируем получение списка студентов перед методом getStudents");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())",
//                    returning = "students")
//    public void afterReturningStudentsLoggingAdvice(List<Student> students){
//        Student firstStudents = students.get(0);
//        String nameSurname = firstStudents.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudents.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudents.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudents.setAvgGrade(avgGrade);
//
//
//        System.out.println("afterReturningStudentsLoggingAdvice: Логируем получение списка студентов после методом getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//                    throwing = "exception")
//    public void afterThrowingStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingStudentsLoggingAdvice: Логируем выброс исключения " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: Логируем нормальное окончание работа метода или выброс исключения");
    }
}
