package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Взял книгу из UniLibrary: ");
        System.out.println("-----------------------------------------");
    }

    public void returnBook(){
        System.out.println("Вернул книгу в UniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void getMagazine(){
        System.out.println("Взял журнал в UniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Вернул журнал в UniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("-----------------------------------------");
    }
}
