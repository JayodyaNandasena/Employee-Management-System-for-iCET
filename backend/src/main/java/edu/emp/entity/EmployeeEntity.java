package edu.emp.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String departmentId;
    private String roleId;
}
