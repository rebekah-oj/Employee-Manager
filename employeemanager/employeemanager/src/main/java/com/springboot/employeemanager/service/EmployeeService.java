package com.springboot.employeemanager.service;

import com.springboot.employeemanager.model.Employee;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployees(){
        return List.of(
        new Employee(
                    1L,
                    "abdulhakeem",
                    "jimoh",
                    "abdulhakeem.jimoh@gmail.com",
                    "IT",
                    "South",
                    LocalDate.MIN

            ),
            new Employee(
                    2L,
                    "val",
                    "ofe",
                    "val.ofe@gmail.com",
                    "IT",
                    "South",
                    LocalDate.MIN

            ),
            new Employee(
                    3L,
                    "rebekah",
                    "oj",
                    "rebekah.oj@gmail.com",
                    "IT",
                    "South",
                    LocalDate.MIN

            )
        );
    }
}
