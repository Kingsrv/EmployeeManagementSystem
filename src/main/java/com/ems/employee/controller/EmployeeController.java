package com.ems.employee.controller;

import com.ems.employee.entities.Employee;
import com.ems.employee.services.EmployeeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> listEmployees(){
        return this.employeeService.listEmployee();
    }

    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.employeeService.addEmployee(employee);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Long id){
        try{
            this.employeeService.deleteEmployee(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
