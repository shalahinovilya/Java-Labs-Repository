package LR_5.controller;

import LR_5.model.Faculty;
import LR_5.model.Human;
import LR_5.model.Sex;
import LR_5.model.University;

public class UniversityCreator implements Creator {
    private FacultyCreator facultyCreator = new FacultyCreator();

    public University create(String name, Human head) {
        University university = new University(name, head);
        Faculty engineering = facultyCreator.create("Engineering", new Human("Jane", "Doe", "MiddleName", Sex.FEMALE));
        university.addFaculty(engineering);
        return university;
    }
}
