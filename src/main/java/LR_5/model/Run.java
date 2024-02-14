package LR_5.model;

import LR_5.controller.UniversityCreator;
import LR_5.model.Human;
import LR_5.model.Sex;
import LR_5.model.University;

public class Run {
    public static void main(String[] args) {
       Run run = new Run();
       run.createTypicalUniversity();
    }

    public void createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        Human rector = new Human("John", "Smith", "", Sex.MALE);
        University myUniversity = universityCreator.create("My University", rector);
    }
}
