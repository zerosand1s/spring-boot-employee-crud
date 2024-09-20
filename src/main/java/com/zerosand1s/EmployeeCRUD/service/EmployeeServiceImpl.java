package com.zerosand1s.EmployeeCRUD.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zerosand1s.EmployeeCRUD.dao.EmployeeDAO;
import com.zerosand1s.EmployeeCRUD.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        Employee employee = employeeDAO.findById(id);
        if (employee == null) {
            throw new RuntimeException("Employee with id \"" + id + "\" not found");
        }
        return employee;
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Employee employee = employeeDAO.findById(id);
        if (employee == null) {
            throw new RuntimeException("Employee with id \"" + id + "\" not found");
        }
        employeeDAO.deleteById(id);
    }

}
