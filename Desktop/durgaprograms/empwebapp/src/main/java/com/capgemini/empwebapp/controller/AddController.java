package com.capgemini.empwebapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOImple;
import com.capgemini.empwebapp.dto.EmployeeTest;
import com.capgemini.empwebapp.service.EmployeeService;
import com.capgemini.empwebapp.service.EmployeeServiceImple;


@WebServlet("/AddController")

	public class AddController extends HttpServlet {
	    @SuppressWarnings("unused")
		@Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String id=req.getParameter("id1");
	    String firstname=req.getParameter("fname");
	    String email=req.getParameter("mail");
	    String password=req.getParameter("pwd");
	   
	    
	    EmployeeTest demo=new EmployeeTest();
	    demo.setEmailId(id);
	    demo.setName(firstname);
	    demo.setEmailId(email);
	    EmployeeService service=new EmployeeServiceImple();
	    boolean check= service.createEmployeeInfo(demo);
	    PrintWriter out=resp.getWriter();
	    out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1></h1>");
		
	    if(check==true) {
					out.println("Insertion sucessfull");
				}
				else {
					out.println("Insertion unsucessfull");
				}
						
	    out.println("</h1>"); 
		  
		out.println("</body>");
		out.println("</html>");

	}
	    
	    }