package edu.training.web.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import edu.training.web.logic.LogicStub;

/**
 * Servlet implementation class GoToRegPageServlet
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final LogicStub logic = new LogicStub();
       
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	
	private void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		
		switch (command) {
		case "login":
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/login.jsp");
			dispatcher.forward(request, response);
			break;
		case "register":
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("WEB-INF/jsp/registration.jsp");
			dispatcher1.forward(request, response);
			break;
		case "main":
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
			dispatcher2.forward(request, response);
			break;
		case "loginToMain":
			String login = request.getParameter("login");
			String password = request.getParameter("password");
			if(logic.checkAuth(login, password)) {
				RequestDispatcher dispatcher3 = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
				dispatcher3.forward(request, response);
			}else {
				RequestDispatcher dispatcher3 = request.getRequestDispatcher("index.jsp");
				dispatcher3.forward(request, response);
			}
		}
	}

}
