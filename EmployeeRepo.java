package com.exampleemployeeapi.Employeeapi.repository;

import com.exampleemployeeapi.Employeeapi.entity.Employeedata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employeedata, Long> {
}
