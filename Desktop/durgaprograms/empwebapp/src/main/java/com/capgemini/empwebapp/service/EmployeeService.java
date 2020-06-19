package com.capgemini.empwebapp.service;

import java.util.List;

import com.capgemini.empwebapp.dto.EmployeeTest;

public interface EmployeeService {
	public EmployeeTest getEmployeeDetailByname(String name);
	  public boolean updateEmployeeInfo(EmployeeTest bean);
	  public boolean createEmployeeInfo(EmployeeTest bean);
	  public List<EmployeeTest> getAllEmployeeDetails();
	boolean deleteEmployeeInfo(int id);
	  public boolean addEmployeeInfo(EmployeeTest bean);

	}


