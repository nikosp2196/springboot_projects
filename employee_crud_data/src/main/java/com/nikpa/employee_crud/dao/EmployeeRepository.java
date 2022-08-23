package com.nikpa.employee_crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikpa.employee_crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    
}
