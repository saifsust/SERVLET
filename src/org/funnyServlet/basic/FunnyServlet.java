package org.funnyServlet.basic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orgfunnyServlet.Services.FunnyService;

/**
 * Servlet implementation class FunnyServlet
 */
@WebServlet("/hello")
public class FunnyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public FunnyServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		FunnyService service = new FunnyService();
		// service.getUsersList("Liton");

		// String message[] = { "Hello World ! I am a passionate programmer in
		// java " };

		request.setAttribute("users", service.getUsersList("Liton"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/hello.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
