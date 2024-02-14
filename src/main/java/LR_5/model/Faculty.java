package LR_5.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Human head;
    private List<Department> departments = new ArrayList<>();

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void setDepartments(List<Department> departmentList) {
        departments = departmentList;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
