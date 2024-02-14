package LR_4.controller;
import LR_4.model.University;
import LR_4.model.Human;
import LR_4.model.Faculty;
import LR_4.model.Sex;

public class UniversityCreator implements Creator  {
    private FacultyCreator facultyCreator = new FacultyCreator();

    public University create(String name, Human head) {
        University university = new University(name, head);
        Faculty engineering = facultyCreator.create("Engineering", new Human("Jane", "Doe", "MiddleName", Sex.FEMALE));
        university.addFaculty(engineering);
        return university;
    }
}
