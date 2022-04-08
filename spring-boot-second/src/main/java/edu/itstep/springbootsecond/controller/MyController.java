package edu.itstep.springbootsecond.controller;

import edu.itstep.springbootsecond.entity.Employee;
import edu.itstep.springbootsecond.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return employees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Employee employee = employeeService.getEmployeeById(id);

        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdateEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdateEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployeeById(id);
        employeeService.deleteEmployeeById(id);
        return "employee with id = " + id + " was deleted";
    }

    @GetMapping("/employees/lastName/{lastName}")
    public List<Employee> getAllEmployeesByLastName(@PathVariable String lastName) {
        List<Employee> employees = employeeService.findAllByLastName(lastName);
        return employees;
    }
}
