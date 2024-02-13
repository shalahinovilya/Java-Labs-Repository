package controller;
import model.University;
import model.Human;
import model.Faculty;
import model.Sex;

public class UniversityCreator implements Creator  {
    private FacultyCreator facultyCreator = new FacultyCreator();

    public University create(String name, Human head) {
        University university = new University(name, head);
        Faculty engineering = facultyCreator.create("Engineering", new Human("Jane", "Doe", "MiddleName", Sex.FEMALE));
        university.addFaculty(engineering);
        return university;
    }
}
