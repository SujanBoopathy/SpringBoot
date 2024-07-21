package com.sujan.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sujan.demo.Employee;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

