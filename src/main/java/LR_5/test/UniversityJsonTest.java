package LR_5.test;

import LR_5.model.*;
import LR_5.controller.UniversityCreator;
import LR_5.controller.JsonManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UniversityJsonTest {

    @Test
    public void testUniversityEquals() {
        University oldUniversity = createTypicalUniversity();

        String filePath = "university.json";
        JsonManager.writeUniversityToJson(oldUniversity, filePath);

        University newUniversity = JsonManager.readUniversityFromJson(filePath);


        assertThat(newUniversity)
                .isEqualToComparingFieldByFieldRecursively(oldUniversity);
    }

    private University createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        Human rector = new Human("John", "Smith", "middleName", Sex.MALE);
        University myUniversity = universityCreator.create("My University", rector);

        List<Faculty> faculties = new ArrayList<>();

        for (int facultyNum = 1; facultyNum <= 2; facultyNum++) {
            List<Department> departments = new ArrayList<>();

            for (int departmentNum = 1; departmentNum <= 2; departmentNum++) {
                List<Group> groups = new ArrayList<>();

                for (int groupNum = 1; groupNum <= 2; groupNum++) {
                    List<Student> students = new ArrayList<>();

                    for (int studentNum = 1; studentNum <= 2; studentNum++) {
                        Student student = new Student("Student" + ((groupNum - 1) * 2 + studentNum), "Surname" + ((groupNum - 1) * 2 + studentNum), "middleName", Sex.MALE);
                        students.add(student);
                    }

                    Human head = new Human("HeadFirstName" + groupNum, "HeadLastName" + groupNum, "HeadMiddleName" + groupNum, Sex.MALE);
                    Group group = new Group("Group" + groupNum, head);
                    group.setStudents(students);
                    groups.add(group);
                }

                Human departmentHead = new Human("ChairFirstName" + departmentNum, "ChairLastName" + departmentNum, "ChairMiddleName" + departmentNum, Sex.MALE);
                Department department = new Department("Department" + departmentNum, departmentHead);
                department.setGroups(groups);
                departments.add(department);
            }

            Human facultyHead = new Human("DeanFirstName" + facultyNum, "DeanLastName" + facultyNum, "DeanMiddleName" + facultyNum, Sex.MALE);
            Faculty faculty = new Faculty("Faculty" + facultyNum, facultyHead);
            faculty.setDepartments(departments);
            faculties.add(faculty);
        }
        myUniversity.setFaculties(faculties);
        return myUniversity;
    }
}