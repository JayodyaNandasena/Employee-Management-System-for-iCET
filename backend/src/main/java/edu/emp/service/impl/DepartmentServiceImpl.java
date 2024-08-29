package edu.emp.service.impl;

import edu.emp.dto.Department;
import edu.emp.entity.DepartmentEntity;
import edu.emp.repository.DepartmentRepository;
import edu.emp.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository repository;
    private final ModelMapper mapper;
    @Override
    public void addDepartment(Department department) {
        repository.save(mapper.map(department, DepartmentEntity.class));
    }

    @Override
    public List<Department> getAll() {
        List<Department> departmentList = new ArrayList<>();

        repository.findAll().forEach(departmentEntity ->
            departmentList.add(mapper.map(departmentEntity, Department.class))
        );

        return departmentList;
    }
}
