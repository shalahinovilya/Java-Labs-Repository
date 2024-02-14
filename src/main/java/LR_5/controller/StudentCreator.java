package LR_5.controller;

import LR_5.model.Sex;
import LR_5.model.Student;

public class StudentCreator  {
    public Student create(String firstName, String lastName, String middleName, Sex sex) {
        return new Student(firstName, lastName, middleName, sex);
    }
}
