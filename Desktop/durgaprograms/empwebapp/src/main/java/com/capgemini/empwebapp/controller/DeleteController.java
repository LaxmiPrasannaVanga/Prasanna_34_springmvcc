package com.capgemini.empwebapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.service.EmployeeService;
import com.capgemini.empwebapp.service.EmployeeServiceImple;


@WebServlet("./DeleteController")

@SuppressWarnings("serial")
public class DeleteController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String id=req.getParameter("id1");
		EmployeeService service=new EmployeeServiceImple();
		service.deleteEmployeeInfo(Integer.parseInt(id));
		String id1=req.getParameter("id1");
		boolean check=service.deleteEmployeeInfo(Integer.parseInt(id1));
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		RequestDispatcher res=req.getRequestDispatcher("/homepage.html");
		
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		
	    if(check==true) {
					out.println("Deletion sucessfull");
				}
				else {
					out.println("Deletion unsucessfull");
				}
						
	    out.println("</h1>");
		  
		out.println("</body>");
		out.println("</html>");
}
}