package com.example.payroll_react.Repositories;

import com.example.payroll_react.Data.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findByLastName(@Param("lastName") String lastName);
}
