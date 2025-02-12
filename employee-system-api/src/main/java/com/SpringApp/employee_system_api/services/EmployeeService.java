package com.SpringApp.employee_system_api.services;

import com.SpringApp.employee_system_api.model.Employee;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
    
    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
