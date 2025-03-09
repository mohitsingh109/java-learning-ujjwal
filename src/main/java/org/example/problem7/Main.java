package org.example.problem7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 75000, "IT", List.of(
                new Project(101, "AI Development", "2025-06-01", 500000),
                new Project(102, "Cloud Migration", "2023-04-15", 200000)
        )));
        employees.add(new Employee(2, "Bob", 60000, "HR", List.of(
                new Project(103, "Employee Engagement", "2024-01-01", 100000)
        )));
        employees.add(new Employee(3, "Charlie", 90000, "IT", List.of(
                new Project(104, "Cybersecurity", "2026-12-10", 750000),
                new Project(101, "AI Development", "2025-06-01", 500000)
        )));

        EmployeeProcessingPipeline.process(employees, 65000, "IT");

    }
}
