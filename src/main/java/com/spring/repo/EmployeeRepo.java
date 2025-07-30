package com.spring.repo;

import com.spring.entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepo {

    public static List<Employee> getAllEmployee(){

        Employee e =  new Employee(101,"kajal","jagtap","Pune");
        Employee e1 = new Employee(102,"om","Chavan","Solapur");
        Employee e2 = new Employee(103,"Shailaja","Kshirsagar","Pune");
        Employee e3 = new Employee(104,"Pragati","Patil","Latur");
        Employee e4 = new Employee(105,"Suyash","Dhajekar","Amravati");
        Employee e5 = new Employee(106,"Riya","Jadgav","Amravati");
        Employee e6 = new Employee(107,"Shivani","Wage","Amravati");
        Employee e7 = new Employee(108,"Devidas","Wage","Kolhapur");
        Employee e8 = new Employee(109,"Raghav","Kahndelwal","Pune");
        Employee e9 = new Employee(110,"Mrunal","Shinde","Pune");

        List<Employee> empList = Arrays.asList(e,e1,e2,e3,e4,e5,e6,e7,e8,e9);
        return empList;
    }
}
