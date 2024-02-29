package com.example.OneToOneRelationship.repository;

import com.example.OneToOneRelationship.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee,Integer>{
        }