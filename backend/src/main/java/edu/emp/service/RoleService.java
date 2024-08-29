package edu.emp.service;

import edu.emp.dto.Role;

import java.util.List;

public interface RoleService {
    void addRole(Role role);
    List<Role> getAll();
}
