package edu.itstep.springbootsecond.repository;


import edu.itstep.springbootsecond.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByLastName(String lastName);

//    @Query(value = "select * from employee", nativeQuery = true)
//    List<Employee>getSome();
}
