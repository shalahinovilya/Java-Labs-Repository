package LR_5.controller;
import LR_5.model.Department;
import LR_5.model.Faculty;
import LR_5.model.Human;
import LR_5.model.Sex;

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