package com.backend.backendapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.backendapplication.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
