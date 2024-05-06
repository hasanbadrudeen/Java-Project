package org.training;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.json.JSONObject;


public class HtmlClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String className = request.getParameter("className");
//		response.setContentType("text/Html");
//		response.setStatus(500);
//response.getWriter().append("<html><body><h1>Hi," + name +"/" + age + "..</h1><h3>...Welcome to " + className + " class...</h3></body></html>");
//		
//		response.getWriter().append("{\"name\": \"" +name+"\",\"age\": \""+ age +" \"} ");
		response.setContentType("Application/json");
		JSONObject obj = new JSONObject();
		obj.put("name", name);
		obj.put("age", age);
		obj.put("className", className);
		response.getWriter().println(obj);
	}

}
