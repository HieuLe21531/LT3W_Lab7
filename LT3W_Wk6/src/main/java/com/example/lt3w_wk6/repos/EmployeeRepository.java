package com.example.lt3w_wk6.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lt3w_wk6.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}