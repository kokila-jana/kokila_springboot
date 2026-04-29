package serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class sessionHandling
 */
@WebServlet("/sessionHandling")
public class sessionHandling extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sessionHandling() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		  response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        HttpSession session = request.getSession(true);
	        Date createTime = new Date(session.getCreationTime());
	        Date accessTime = new Date(session.getLastAccessedTime());

	        String name = "Kokila";  // you can also get from form
	        String greeting;

	        if (session.isNew()) {
	            greeting = "Welcome ";
	        } else {
	            greeting = "Welcome back ";
	        }

	        out.println("<html><body>");
	        out.println("<h2>" + greeting + name + "</h2>");
	        out.println("<p>Session Created: " + createTime + "</p>");
	        out.println("<p>Last Accessed: " + accessTime + "</p>");
	        out.println("</body></html>");
	    }	
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
