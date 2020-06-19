package com.capgemini.empwebapp.service;

import java.util.List;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOImple;
import com.capgemini.empwebapp.dto.EmployeeTest;

public class EmployeeServiceImple  implements EmployeeService{

	

	private EmployeeDAO dao=new EmployeeDAOImple();

	@Override
	public EmployeeTest getEmployeeDetailByname(String name) {
		
		return dao.getEmployeeDetailsByname("prasanna");
	}
	
	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeInfo(32);
	}
	@Override
	public boolean updateEmployeeInfo(EmployeeTest bean) {
		
		return dao.updateEmployeeInfo(bean);
	}

	@Override
	public boolean createEmployeeInfo(EmployeeTest bean) {
		
		return dao.createEmployeeInfo(bean);
	}

	@Override
	public List<EmployeeTest> getAllEmployeeDetails() {
		
		return dao.getAllEmployeeDetails();
	}

	@Override
	public boolean addEmployeeInfo(EmployeeTest bean) {
		// TODO Auto-generated method stub
		return dao.addEmployeeInfo();
	}

	
}