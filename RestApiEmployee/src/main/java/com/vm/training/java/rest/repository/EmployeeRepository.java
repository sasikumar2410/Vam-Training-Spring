package com.vm.training.java.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vm.training.java.rest.entity.Employee;
 
 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
 
}
