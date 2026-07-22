package com.cognizant.spring_learn.dao;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.spring_learn.Employee;
import com.cognizant.spring_learn.service.exception.EmployeeNotFoundException;

@Repository
public class EmployeeDao {

    private static ArrayList<Employee> EMPLOYEE_LIST;


    public EmployeeDao() {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        EMPLOYEE_LIST =
                (ArrayList<Employee>) context.getBean("employeeList");

        context.close();
    }


    public ArrayList<Employee> getAllEmployees() {

        return EMPLOYEE_LIST;
    }


    public void updateEmployee(Employee employee)
            throws EmployeeNotFoundException {


        boolean found = false;


        for (int i = 0; i < EMPLOYEE_LIST.size(); i++) {

            Employee existingEmployee = EMPLOYEE_LIST.get(i);


            if (existingEmployee.getId() == employee.getId()) {

                EMPLOYEE_LIST.set(i, employee);

                found = true;

                break;
            }
        }


        if (!found) {

            throw new EmployeeNotFoundException();
        }
    }


    public void deleteEmployee(int id)
            throws EmployeeNotFoundException {


        boolean found = false;


        for (int i = 0; i < EMPLOYEE_LIST.size(); i++) {


            Employee employee = EMPLOYEE_LIST.get(i);


            if (employee.getId() == id) {


                EMPLOYEE_LIST.remove(i);

                found = true;

                break;
            }
        }


        if (!found) {

            throw new EmployeeNotFoundException();
        }
    }
}