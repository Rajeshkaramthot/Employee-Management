package com.amdocs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
