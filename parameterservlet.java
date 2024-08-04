import java.io.*;
import java.util.*;
import javax.servlet.*;

public class parameterservlet extends GenericServlet
{
    public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String num=request.getParameter("txtnum");
        out.println("Employee Number is:"+num);
        out.write("<br>");
        String enm=request.getParameter("txtnm");
        out.println("Employee Name is:"+enm);
        out.write("<br>");
        String des=request.getParameter("txtdes");
        out.println("Designation is:"+des);
        out.write("<br>");
        String qua=request.getParameter("txtQua");
        out.println("Qualification is:"+qua);
    }
}