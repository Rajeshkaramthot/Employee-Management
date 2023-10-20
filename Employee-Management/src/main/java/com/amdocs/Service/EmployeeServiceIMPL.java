package com.amdocs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Employee;
import com.amdocs.repo.EmployeeDao;

@Service

public class EmployeeServiceIMPL implements EmployeeService{
		@Autowired
		private EmployeeDao employeeDao;

		@Override
		public List<Employee> getEmployees() {
		return employeeDao.findAll();
		}

		@Override
		public Employee getEmployee(long id) {
		return employeeDao.findById(id).get();
		}

		@Override
		public Employee updateEmployee(Employee Employee) {
		employeeDao.save(Employee);
		return Employee;
		}

		@Override
		public Employee addEmployee(Employee Employee) {
		employeeDao.save(Employee);
		return Employee;
		}

		@Override
		public void deleteEmployee(long parseLong) {
		Employee entity = employeeDao.getOne(parseLong);
		employeeDao.delete(entity);
		}
		}
