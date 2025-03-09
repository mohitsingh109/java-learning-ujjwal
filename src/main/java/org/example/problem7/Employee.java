package org.example.problem7;

import java.util.List;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String department;
    private List<Project> projects;

    public Employee(int id, String name, double salary, String department, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.projects = projects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
