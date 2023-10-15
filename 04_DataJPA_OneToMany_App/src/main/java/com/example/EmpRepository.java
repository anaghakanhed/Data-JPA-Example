package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
