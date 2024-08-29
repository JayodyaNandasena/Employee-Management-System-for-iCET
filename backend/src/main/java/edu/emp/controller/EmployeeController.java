package edu.emp.controller;

import edu.emp.dto.Employee;
import edu.emp.service.EmployeeService;
import edu.emp.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService service;

    EmployeeController(EmployeeService service){
        this.service = service;
    }

    @PostMapping("/persist")
    public void addEmployee(@RequestBody Employee employee){
        service.persist(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return service.getAll();
    }
}
