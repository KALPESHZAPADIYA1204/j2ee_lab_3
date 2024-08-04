import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class userservlet extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String un=request.getParameter("txtun");
        out.println("Welcome"+un);

    }

}