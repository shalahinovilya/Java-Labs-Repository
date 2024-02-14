package LR_4.controller;
import LR_4.model.Group;
import LR_4.model.Human;
import LR_4.model.Sex;
import LR_4.model.Student;

public class GroupCreator implements Creator  {
    private StudentCreator studentCreator = new StudentCreator();

    @Override
    public Group create(String name, Human head) {
        Group group = new Group(name, head);
        Student student = studentCreator.create("Max", "Payne", "MiddleName", Sex.MALE);
        group.addStudent(student);
        return group;
    }
}
