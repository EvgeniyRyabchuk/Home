package edu.itstep.springbootsecond.service;



import edu.itstep.springbootsecond.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveOrUpdateEmployee(Employee employee);

    Employee getEmployeeById(int id);

    void deleteEmployeeById(int id);

    List<Employee> findAllByLastName(String lastName);
}
