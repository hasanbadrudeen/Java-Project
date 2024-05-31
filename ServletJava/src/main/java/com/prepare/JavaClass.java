package com.prepare;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.json.JSONObject;


public class JavaClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name  = request.getParameter("name");
		String age  = request.getParameter("age");
		String ClassName  = request.getParameter("ClassName");
		
		
		response.setContentType("Application/json");
		JSONObject obj = new JSONObject();
		obj.put("name", name);
		obj.put("age", age);
		obj.put("ClassName", ClassName);
		
		response.getWriter().println(obj);
		
		
		
		
		
		
	
	}

}
