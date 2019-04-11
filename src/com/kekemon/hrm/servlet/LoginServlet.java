package com.kekemon.hrm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kekemon.hrm.EmployeeUtils;
import com.kekemon.hrm.model.Employee;


public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Override
//	public void doGet(HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException {
//		doPost(request, response);
//	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String userName = request.getParameter("UserName");
	    String passsWord = request.getParameter("Password");
	    
	   Employee employee =  EmployeeUtils.getEmployeeBy(userName, passsWord);
	    
		if(employee != null){
            //creating a session
            HttpSession session = request.getSession();
            session.setAttribute("user", userName);
            session.setAttribute("pass", passsWord);
    		response.sendRedirect("Dashboard");
        }else{
        	response.sendRedirect("InvalidLogin.html");
        }
	}	
	
}