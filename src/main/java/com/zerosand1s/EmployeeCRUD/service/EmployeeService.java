package com.zerosand1s.EmployeeCRUD.service;

import java.util.List;

import com.zerosand1s.EmployeeCRUD.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
