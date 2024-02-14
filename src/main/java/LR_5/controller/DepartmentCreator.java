package LR_5.controller;
import LR_5.model.Department;
import LR_5.model.Group;
import LR_5.model.Human;
import LR_5.model.Sex;

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
