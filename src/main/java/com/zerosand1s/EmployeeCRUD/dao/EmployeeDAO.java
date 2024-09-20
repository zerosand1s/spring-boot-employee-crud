package com.zerosand1s.EmployeeCRUD.dao;

import java.util.List;

import com.zerosand1s.EmployeeCRUD.entity.Employee;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);

}
