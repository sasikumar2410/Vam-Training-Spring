package com.vm.training.java.rest.service;

import java.util.List;

import com.vm.training.java.rest.entity.Employee;


 
/**
 * @author JavaSolutionsGuide
 *
 */
public interface EmployeeService {
 public List<Employee> retrieveEmployees();
  
 public Employee getEmployee(Long employeeId);
  
 public void saveEmployee(Employee employee);
  
 public void deleteEmployee(Long employeeId);
  
 public void updateEmployee(Employee employee);
}