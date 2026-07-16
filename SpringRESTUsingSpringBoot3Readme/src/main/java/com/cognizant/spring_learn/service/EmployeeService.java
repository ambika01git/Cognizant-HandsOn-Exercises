package com.cognizant.spring_learn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Employee;
import com.cognizant.spring_learn.dao.EmployeeDao;
import com.cognizant.spring_learn.service.exception.EmployeeNotFoundException;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;


    public ArrayList<Employee> getAllEmployees() {

        return employeeDao.getAllEmployees();
    }


    public void updateEmployee(Employee employee)
            throws EmployeeNotFoundException {

        employeeDao.updateEmployee(employee);
    }


    public void deleteEmployee(int id)
            throws EmployeeNotFoundException {

        employeeDao.deleteEmployee(id);
    }
}