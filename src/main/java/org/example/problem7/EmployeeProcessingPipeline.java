package org.example.problem7;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeProcessingPipeline {

    public static void process(List<Employee> employees, double salary, String department) {
         //processing
        /**
         * Filter Employees with salary > 65000 and department IT.
         * Employees selected: Alice, Charlie
         * Extract their projects:
         * Projects: AI Development, Cybersecurity (Cloud Migration is removed due to deadline).
         * Sort projects by budget (descending order):
         * Cybersecurity (750000), AI Development (500000)
         * Compute total budget: 1,250,000
         * Generate Report:
         * Report:
         * Employees Considered: 2
         * Projects Considered: 2
         * Total Project Budget: $1,250,000
         */

        List<Employee> filteredEmployee = employees.stream()
                .filter(e -> e.getSalary() > salary)
                .filter(e -> e.getDepartment().equals(department))
                .toList();


        List<Project> filteredProject = filteredEmployee.stream()
                .flatMap(e -> e.getProjects().stream())
                .filter(p -> p.getDeadline().isAfter(LocalDate.now()))
                .sorted(Comparator.comparingInt(p -> -p.getBudget()))
                .toList();

        filteredProject = filteredEmployee.stream()
                .flatMap(e -> e.getProjects().stream())
                .filter(p -> p.getDeadline().isAfter(LocalDate.now()))
                .collect(Collectors.toMap(
                        p -> p.getProjectId(),
                        p -> p,
                        (existing, duplicate) -> existing
                ))
                .values()
                .stream()
                .sorted(Comparator.comparingInt(p -> -p.getBudget()))
                .toList();

        int totalBudget = filteredProject.stream()
                .mapToInt(Project::getBudget)
                .sum();

        System.out.println("Report:");
        System.out.println("Employees Considered: " + filteredEmployee.size());
        System.out.println("Projects Considered: " + filteredProject.size());
        System.out.println("Total Project Budget: " + totalBudget);
    }
}
