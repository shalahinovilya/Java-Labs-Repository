package LR_4.controller;
import LR_4.model.Department;
import LR_4.model.Faculty;
import LR_4.model.Human;
import LR_4.model.Sex;

public class FacultyCreator implements Creator  {

    private DepartmentCreator departmentController = new DepartmentCreator();

    @Override
    public Faculty create(String name, Human head) {
        Faculty faculty = new Faculty(name, head);
        Department softwareEngineering = departmentController.create("Software Engineering", new Human("Alice", "Johnson", "MiddleName", Sex.FEMALE));
        faculty.addDepartment(softwareEngineering);
        return faculty;
    }
}