package com.sujan.demo.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sujan.demo.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}

