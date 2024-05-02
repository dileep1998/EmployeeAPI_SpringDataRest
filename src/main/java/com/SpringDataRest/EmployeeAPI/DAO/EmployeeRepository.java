package com.SpringDataRest.EmployeeAPI.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringDataRest.EmployeeAPI.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
