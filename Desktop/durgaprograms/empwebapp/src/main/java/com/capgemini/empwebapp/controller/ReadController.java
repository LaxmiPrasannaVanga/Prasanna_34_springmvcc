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


@WebServlet("/ReadController")

public class ReadController extends HttpServlet {
//	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id1");
		EmployeeService service = new EmployeeServiceImple();
	    EmployeeTest bean=service.getEmployeeDetailByname("manvitha");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1></h1>");

		out.print("<table border='1' width='100%'");
		out.print(
				"<tr><th>Id</th><th>LastName</th><th>FirstName</th><th>Department</th><th>Salary</th><th>EmailId</th></tr>");
	
		
				out.print("<tr><td>" + bean.getEid() + "</td><td>" + bean.getName() + "</td><td>" + bean.getGender() + "</td>" + " <td>"
						+ bean.getDesignation() + "</td><td>" + bean.getSalary() + "</td>" + "<td>"+ bean.getEmailId() +"</td></tr>");
		
		out.print("</table>");
			
		

		out.println("</body>");
		out.println("</html>");

	}
}
