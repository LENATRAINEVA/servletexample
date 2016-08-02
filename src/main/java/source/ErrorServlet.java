package source;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ErrorServlet extends HttpServlet {

    private String message;

    public void init() throws ServletException
    {
        message = "Servlet Start! 5";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

}