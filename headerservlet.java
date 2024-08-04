import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class headerservlet extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter ul=response.getWriter();
        ul.println("<html>");
        ul.println("<head>");
        ul.println("<title>T.N.rao college</title>");
        ul.println("</head>");
        ul.println("<body>");
        ul.println("<h1> T.N.Rao college</h1>");
        ul.println("</body>");
        ul.println("</html>");
        
        
    }
}