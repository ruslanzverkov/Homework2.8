package com.example.homeworkemployee.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
   private final String firstName;
   private final String lastName;
   private final double salary;
   private final int department;

    public Employee(String firstName, String lastName, double salary, int department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    List<Employee > employees= new ArrayList<>(List.of(
            new Employee("Василий ", "Корнев", 29350,2),
            new Employee("Василий ", "Степанов", 22350,2),
            new Employee("Сергей ", "Безруков", 30555,4),
            new Employee("Сергей ", "Бородин", 10555,4),
            new Employee("Андрей ", "Сусликов", 25500,5),
            new Employee("Андрей ", "Куприянов", 21500,5),
            new Employee("Александр ", "Македонский", 23330,3),
            new Employee("Александр ", "Попов", 21330,3),
            new Employee("Василий ", "Васильев", 24000,1),
            new Employee("Василий ", "Корнеев", 14000,1)));

}
