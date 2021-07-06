package com.ems.employee.services;

import com.ems.employee.dao.EmployeeDao;
import com.ems.employee.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> listEmployee() {
        return employeeDao.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public void deleteEmployee(Long parseLong) {
        Employee employee = employeeDao.getById(parseLong);
        this.employeeDao.delete(employee);
    }
}
