package com.Spring.crud.repository;

import com.Spring.crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //Crud Operations
}
