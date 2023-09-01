package com.oguztest.Employee.services;

import com.oguztest.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getAllEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
