package edu.emp.service;

import edu.emp.dto.Employee;

import java.util.List;

public interface EmployeeService {
    void persist(Employee employee);
    List<Employee> getAll();
}
