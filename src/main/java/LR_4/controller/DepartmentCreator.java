package LR_4.controller;
import LR_4.model.Department;
import LR_4.model.Group;
import LR_4.model.Human;
import LR_4.model.Sex;

public class DepartmentCreator implements Creator {
    private GroupCreator groupCreator = new GroupCreator();
    @Override
    public Department create(String name, Human head) {
        Department department = new Department(name, head);
        Group seGroup = groupCreator.create("SE-2021", new Human("Bob", "Brown", "MiddleName", Sex.MALE));
        department.addGroup(seGroup);
        return department;
    }
}
