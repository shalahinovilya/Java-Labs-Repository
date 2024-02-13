package controller;
import model.Group;
import model.Human;
import model.Sex;
import model.Student;

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
