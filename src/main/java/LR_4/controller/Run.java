package LR_4.controller;
import LR_4.model.Human;
import LR_4.model.University;
import LR_4.model.Sex;

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
