package LR_6.model;

import java.sql.Date;

public class Student extends Human {
    private Date birthdate;
    private String recordBookNumber;

    public Student(String firstName, String lastName, String middleName, Date birthdate, String recordBookNumber, Sex sex) {
        super(firstName, lastName, middleName, sex);
        this.birthdate = birthdate;
        this.recordBookNumber = recordBookNumber;
    }
}