## **Problem Statement**
You need to build a **complex data processing system** that handles a list of objects. The system should:
1. **Retrieve a list of Employee objects**.
2. **Filter** employees based on specific criteria (e.g., salary, department).
3. **Extract and further process a list of Projects** that employees are assigned to.
4. **Apply transformations** on the projects (e.g., filter based on deadline, sort by budget, compute total expenses).
5. **Finally, generate a report** summarizing the processed data.

---

## **Requirements**
### **1. Define an Employee Class**
- Fields: `id`, `name`, `salary`, `department`, `List<Project> projects`
- Constructor and Getters

### **2. Define a Project Class**
- Fields: `projectId`, `projectName`, `deadline`, `budget`
- Constructor and Getters

### **3. Main Processing Tasks**
- **Retrieve a list of employees** (store in a `List<Employee>`).
- **Filter employees** who:
    - Have a salary greater than a given threshold.
    - Belong to a specific department.
- **Extract their projects** and store in `List<Project>`.
- **Further filter projects** based on deadline (e.g., remove past deadlines).
- **Sort projects by budget** in descending order.
- **Compute total budget** of remaining projects.
- **Generate a summary report** that displays:
    - Number of employees processed.
    - Number of projects considered.
    - Total budget of filtered projects.

---

## **Example Input & Output**
### **Given Employees & Projects:**
```java
List<Employee> employees = new ArrayList<>();
employees.add(new Employee(1, "Alice", 75000, "IT", List.of(
    new Project(101, "AI Development", "2025-06-01", 500000),
    new Project(102, "Cloud Migration", "2023-04-15", 200000)
)));
employees.add(new Employee(2, "Bob", 60000, "HR", List.of(
    new Project(103, "Employee Engagement", "2024-01-01", 100000)
)));
employees.add(new Employee(3, "Charlie", 90000, "IT", List.of(
    new Project(104, "Cybersecurity", "2026-12-10", 750000)
)));
```

### **Processing Steps:**
1. Filter Employees with salary > **65000** and department **IT**.
    - Employees selected: **Alice, Charlie**
2. Extract their projects:
    - Projects: **AI Development, Cybersecurity** (Cloud Migration is removed due to deadline).
3. Sort projects by budget (descending order):
    - **Cybersecurity (750000), AI Development (500000)**
4. Compute total budget: **1,250,000**
5. Generate Report:
```
Report:
Employees Considered: 2
Projects Considered: 2
Total Project Budget: $1,250,000
```

---
