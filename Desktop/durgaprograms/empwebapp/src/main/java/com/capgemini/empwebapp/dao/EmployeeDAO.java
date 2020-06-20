package com.capgemini.empwebapp.dao;


import java.util.List;

import com.capgemini.empwebapp.dto.EmployeeTest;


public interface EmployeeDAO {
  public EmployeeTest getEmployeeDetailsByname(String name);
  public boolean deleteEmployeeInfo(int id);
  public boolean updateEmployeeInfo(EmployeeTest bean);
  public boolean createEmployeeInfo(EmployeeTest bean);
  public List<EmployeeTest> getAllEmployeeDetails();
public EmployeeTest login(int id, String empPass);
}