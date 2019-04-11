package com.kekemon.hrm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DashboardServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("user");
		String passWord = (String) session.getAttribute("pass");
		if(userName == null || passWord == null){
			response.sendRedirect("index.html");
		}else{
//			String nextHTML = "/aa.fxml";
			String nextHTML = "/dashboard.jsp";
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextHTML);
			dispatcher.forward(request, response);
		}
	}
}