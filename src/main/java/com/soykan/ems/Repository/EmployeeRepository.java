package com.soykan.ems.Repository;

import com.soykan.ems.Entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface EmployeeRepository extends CrudRepository<Employee, UUID> {
}


