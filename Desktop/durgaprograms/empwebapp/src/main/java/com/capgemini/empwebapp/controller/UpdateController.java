package com.capgemini.empwebapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.dto.EmployeeTest;
import com.capgemini.empwebapp.service.EmployeeService;
import com.capgemini.empwebapp.service.EmployeeServiceImple;

@WebServlet("/UpdateController")

@SuppressWarnings("serial")
public class UpdateController extends HttpServlet{

	

	@SuppressWarnings("unused")
	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getParameter("id");
		
		String id = req.getParameter("id1");
		String lname = req.getParameter("name");
		EmployeeTest bean = new EmployeeTest();
		bean.setEid(Integer.parseInt(id));
		bean.setName(lname);

		EmployeeService service = new EmployeeServiceImple();
		boolean check = service.updateEmployeeInfo(bean);
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");

		if (check == true) {
			out.println("Updation sucessfull");
		} else {
			out.println("Updation unsucessfull");
		}
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	 
	 	}
	}