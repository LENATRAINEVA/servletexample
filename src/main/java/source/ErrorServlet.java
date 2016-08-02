package source;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ErrorServlet extends HttpServlet {

    public static String error;

    public void init() throws ServletException {}

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + error + "</h1>");
    }

}