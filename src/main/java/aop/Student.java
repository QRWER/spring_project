package aop;

import org.springframework.stereotype.Component;

public class Student {
    private String nameSurname;
    private int corse;
    private double avgGrade;

    public Student(String nameSurname, int corse, double avgGrade) {
        this.nameSurname = nameSurname;
        this.corse = corse;
        this.avgGrade = avgGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCorse() {
        return corse;
    }

    public void setCorse(int corse) {
        this.corse = corse;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", corse=" + corse +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
