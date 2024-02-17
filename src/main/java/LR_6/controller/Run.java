package LR_6.controller;

import LR_6.controller.StudentRepository;
import LR_6.model.Human;
import LR_6.model.Sex;
import LR_6.model.University;
import LR_6.model.Student;

import java.util.List;

public class Run {
    public static void main(String[] args) {
       Run run = new Run();
       StudentRepository studentRepository = new StudentRepository();
       List<Student> students = studentRepository.getStudentsBornInMonth(12);
       System.out.println(students);
       run.createTypicalUniversity();
    }

    public void createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        Human rector = new Human("John", "Smith", "", Sex.MALE);
        University myUniversity = universityCreator.create("My University", rector);
    }
}
