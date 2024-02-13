package controller;
import model.Student;
import model.Sex;

public class StudentCreator  {
    public Student create(String firstName, String lastName, String middleName, Sex sex) {
        return new Student(firstName, lastName, middleName, sex);
    }
}
