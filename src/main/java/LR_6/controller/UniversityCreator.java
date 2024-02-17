package LR_6.controller;

import LR_6.model.Faculty;
import LR_6.model.Human;
import LR_6.model.Sex;
import LR_6.model.University;

public class UniversityCreator implements Creator {
    private FacultyCreator facultyCreator = new FacultyCreator();

    public University create(String name, Human head) {
        University university = new University(name, head);
        Faculty engineering = facultyCreator.create("Engineering", new Human("Jane", "Doe", "MiddleName", Sex.FEMALE));
        university.addFaculty(engineering);
        return university;
    }
}
