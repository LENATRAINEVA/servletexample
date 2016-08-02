package source;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Сервлет отображения ошибки, если в спринговом контексте произошла ошибка
 */
public class ErrorServlet extends HttpServlet {

    public static Exception error;

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