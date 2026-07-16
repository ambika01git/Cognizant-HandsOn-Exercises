package com.cognizant.spring_learn.dao;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.spring_learn.Department;
import com.cognizant.spring_learn.Employee;

@Repository
public class DepartmentDao {

    private static ArrayList<Department> DEPARTMENT_LIST;

    @SuppressWarnings("unchecked")
    public DepartmentDao() {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        ArrayList<Employee> employeeList =
                (ArrayList<Employee>) context.getBean("employeeList");

        DEPARTMENT_LIST = new ArrayList<>();

        for (Employee employee : employeeList) {

            Department department = employee.getDepartment();

            boolean exists = false;

            for (Department d : DEPARTMENT_LIST) {

                if (d.getId() == department.getId()) {
                    exists = true;
                    break;
                }

            }

            if (!exists) {
                DEPARTMENT_LIST.add(department);
            }

        }

        context.close();
    }

    public ArrayList<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}