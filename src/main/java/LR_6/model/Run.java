package LR_6.model;

import LR_6.controller.UniversityCreator;

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
