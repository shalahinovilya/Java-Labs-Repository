package LR_4.controller;
import LR_4.model.Student;
import LR_4.model.Sex;

public class StudentCreator  {
    public Student create(String firstName, String lastName, String middleName, Sex sex) {
        return new Student(firstName, lastName, middleName, sex);
    }
}
