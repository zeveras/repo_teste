package br.com.alpha.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowTable extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5040175549102347356L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>olá! teste!</body></html>");
		
		//teste
		
		throw new IOException();
	}
}
