import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class hello extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {

        PrintWriter out=response.getWriter();
        out.println("Hello world");
    }
} 