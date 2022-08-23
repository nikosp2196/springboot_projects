package com.nikpa.employee_crud.dao;

import java.util.List;

import com.nikpa.employee_crud.entity.Employee;

public interface EmployeeDAO {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);
}
