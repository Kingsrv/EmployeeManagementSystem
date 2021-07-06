package com.ems.employee.dao;

import com.ems.employee.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
