package com.example.homeworkemployee.service;

import com.example.homeworkemployee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Map<String,Employee> employees;

    public EmployeeServiceImpl(List<Employee> employees) {
        this.employees = new HashMap<>();
    }


    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employees.values());
    }
}
