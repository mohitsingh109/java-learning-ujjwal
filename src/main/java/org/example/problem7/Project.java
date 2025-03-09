package org.example.problem7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Project {
    private int projectId;
    private String projectName;
    private LocalDate deadline;
    private int budget;

    public Project(int projectId, String projectName, String deadline, int budget) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.deadline = LocalDate.parse(deadline, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.budget = budget;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
