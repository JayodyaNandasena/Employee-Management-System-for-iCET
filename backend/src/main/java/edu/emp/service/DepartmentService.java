package edu.emp.service;

import edu.emp.dto.Department;

import java.util.List;

public interface DepartmentService {
    void addDepartment(Department department);
    List<Department> getAll();
}
