package com.dailycodedebugger.employeeservice.repository;

import com.dailycodedebugger.employeeservice.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    List<Employee> employeeList = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    public  Employee findById(Long id) {
        return employeeList.stream()
                .filter(employ -> employ.id().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Employee> findAll() {
        return employeeList;
    }

    public List<Employee> findByDepartment(Long departmentId) {
        return employeeList.stream()
                .filter(a -> a.departmentId().equals(departmentId))
                .toList();
    }
}
