package LR_5.controller;
import LR_5.model.Group;
import LR_5.model.Human;
import LR_5.model.Sex;
import LR_5.model.Student;

public class GroupCreator implements Creator {
    private StudentCreator studentCreator = new StudentCreator();

    @Override
    public Group create(String name, Human head) {
        Group group = new Group(name, head);
        Student student = studentCreator.create("Max", "Payne", "MiddleName", Sex.MALE);
        group.addStudent(student);
        return group;
    }
}
