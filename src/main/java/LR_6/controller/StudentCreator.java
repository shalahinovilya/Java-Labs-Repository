package LR_6.controller;

import LR_6.model.Sex;
import LR_6.model.Student;

import java.sql.Date;

public class StudentCreator  {
    public Student create(String firstName, String lastName, String middleName, Date birthdate, String recordBookNumber, Sex sex) {
        return new Student(firstName, lastName, middleName, birthdate, recordBookNumber, sex);
    }
}
