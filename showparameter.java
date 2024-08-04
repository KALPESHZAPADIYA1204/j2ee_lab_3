import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class showparameter extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Enumeration pn = request.getParameterNames();
        
        while (pn.hasMoreElements()) {
            String paramNames =(String)pn.nextElement();
            out.println(paramNames + ": ");
            String[] pv = request.getParameterValues(paramNames);
            
            if (pv.length == 1) {
                String paramvalue = pv[0];
                if (paramvalue.length() == 0)
                    out.println("No value");
                else
                    out.println(paramvalue);
            } else {
                out.println("<ul>");
                for (int i = 0; i < pv.length; i++) {
                    out.println("<li>" + pv[i] + "</li>");
                }
                out.println("</ul>");
            }
            out.println("<br>");
        }
    }
}