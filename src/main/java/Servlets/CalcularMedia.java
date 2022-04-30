package Servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CalcularMedia
 */
public class CalcularMedia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularMedia() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		float valor1, valor2, media;
	
		valor1 = Float.parseFloat(request.getParameter("val01").replace(',','.'));
		valor2 = Float.parseFloat(request.getParameter("val02").replace(',','.'));
	    media = (valor1+valor2)/2;
	    
	    request.setAttribute("media", media);
	  
	    RequestDispatcher despatcher = request.getRequestDispatcher("visao.jsp");
	    despatcher.forward(request, response);
		
//		PrintWriter out;
	    //		response.setContentType("text/html");
	    //		out = response.getWriter();
	
	    //		out.println("<html>");
	    //	out.println("<head>");
	    //	out.println("<title>Cálculo da media</title>");
	    //	out.println("</head>");
	    //	out.println("<body>");
	    //	out.println("<h2>Media para os números informados:</h2>");
	    //	out.println("<p>Media: " + media + "</p>");
	    //	out.println("</body>");
	    //	out.println("</html>");
	}
}
