package edu.emp.controller;

import edu.emp.dto.Role;
import edu.emp.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/role")
public class RoleController {
    private final RoleService roleService;

    @PostMapping
    public void addRole(@RequestBody Role role){
        roleService.addRole(role);
    }

    @GetMapping
    public List<Role> getAllRoles(){
        return roleService.getAll();
    }
}
