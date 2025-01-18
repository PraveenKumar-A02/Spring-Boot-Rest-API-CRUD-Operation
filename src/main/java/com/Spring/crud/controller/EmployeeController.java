package com.Spring.crud.controller;

import com.Spring.crud.model.Employee;
import com.Spring.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    //GetAll Rest Api
    @GetMapping("api/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    //Get by Id Rest Api
    @GetMapping("api/employees/{id}")
    // localhost:8080/api/employees/1
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeID){
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeID),HttpStatus.OK);
    }

    //Update Rest Api
    @PutMapping("api/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,
                                                   @RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,id),HttpStatus.OK);
    }

    //Delete Rest Api
    @DeleteMapping("api/employees/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
        //delete employee from db
        employeeService.deleteEmployee(id);
        return new ResponseEntity<String>("Employee deleted Successfully.",HttpStatus.OK);
    }
}
