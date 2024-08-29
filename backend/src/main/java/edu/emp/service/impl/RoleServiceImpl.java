package edu.emp.service.impl;

import edu.emp.dto.Role;
import edu.emp.entity.RoleEntity;
import edu.emp.repository.RoleRepository;
import edu.emp.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository repository;
    private final ModelMapper mapper;
    @Override
    public void addRole(Role role) {
        repository.save(mapper.map(role, RoleEntity.class));
    }

    @Override
    public List<Role> getAll() {
        List<Role> roleList = new ArrayList<>();

        repository.findAll().forEach(roleEntity -> {
            roleList.add(mapper.map(roleEntity, Role.class));
        });

        return roleList;
    }
}
