package LR_6.controller;
import LR_6.model.Group;
import LR_6.model.Human;
import LR_6.model.Sex;
import LR_6.model.Student;

import java.sql.Date;

public class GroupCreator implements Creator {
    private StudentCreator studentCreator = new StudentCreator();

    @Override
    public Group create(String name, Human head) {
        Group group = new Group(name, head);
        Student student = studentCreator.create("Max", "Payne", "MiddleName",  new Date(2012, 10, 12), "6534", Sex.MALE);
        group.addStudent(student);
        return group;
    }
}
