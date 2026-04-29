package serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class exception_Hand
 */
@WebServlet("/exception_Hand")
public class exception_Hand extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public exception_Hand() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        try {
	            int a = 10;
	            int b = 0;

	            int result = a / b;   // Exception occurs here

	            out.println("<h2>Result = " + result + "</h2>");

	        } catch (ArithmeticException e) {
	            out.println("<h2>Error: Cannot divide by zero!</h2>");
	        }

	        out.println("<h3>Program continues...</h3>");
	    }	
		
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
