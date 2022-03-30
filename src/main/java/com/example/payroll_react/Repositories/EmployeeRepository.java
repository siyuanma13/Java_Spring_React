package com.example.payroll_react.Repositories;

import com.example.payroll_react.Data.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
