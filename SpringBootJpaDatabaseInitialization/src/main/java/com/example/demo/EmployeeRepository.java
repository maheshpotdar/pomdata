package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

} 
