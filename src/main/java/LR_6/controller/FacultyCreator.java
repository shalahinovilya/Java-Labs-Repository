package LR_6.controller;
import LR_6.model.Department;
import LR_6.model.Faculty;
import LR_6.model.Human;
import LR_6.model.Sex;

public class FacultyCreator implements Creator {

    private DepartmentCreator departmentController = new DepartmentCreator();

    @Override
    public Faculty create(String name, Human head) {
        Faculty faculty = new Faculty(name, head);
        Department softwareEngineering = departmentController.create("Software Engineering", new Human("Alice", "Johnson", "MiddleName", Sex.FEMALE));
        faculty.addDepartment(softwareEngineering);
        return faculty;
    }
}