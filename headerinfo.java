import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class headerinfo extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        PrintWriter out=response.getWriter();
        out.println("Reuest headers are::");
        Enumeration enm=request.getHeaderNames();
        while(enm.hasMoreElements())
        {
            String hn=(String)enm.nextElement();
            Enumeration hv=request.getHeaders(hn);
            if(hv != null)
            {
                String values=(String)hv.nextElement();
                out.println(hn+":"+values);
            }
        }
    }
}