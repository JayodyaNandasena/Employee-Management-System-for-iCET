package edu.emp.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.emp.dto.Employee;
import edu.emp.entity.EmployeeEntity;
import edu.emp.repository.EmployeeRepository;
import edu.emp.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employeeList = new ArrayList<>();

    EmployeeRepository repository;
    ObjectMapper mapper;

    EmployeeServiceImpl(EmployeeRepository repository, ObjectMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void persist(Employee employee) {
        EmployeeEntity entity = mapper.convertValue(employee, EmployeeEntity.class);
        repository.save(entity);
    }

    @Override
    public List<Employee> getAll() {
        Iterable<EmployeeEntity> all = repository.findAll();

        all.forEach(employeeEntity -> {
            employeeList.add(
                    mapper.convertValue(employeeEntity, Employee.class)
            );
        });

        return employeeList;
    }
}
