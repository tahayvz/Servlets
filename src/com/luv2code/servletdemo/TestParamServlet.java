package com.luv2code.servletdemo;
 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class TestParamServlet
 */
public class TestParamServlet extends HttpServlet {
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Step 1: set content type
        response.setContentType("text/html");
        
        // Step 2: get printwriter
        PrintWriter out = response.getWriter();
        
        // Step 3: read configuration params
        ServletContext context = getServletContext(); // inherit from HttpServlet
        String maxCartSize = context.getInitParameter("max-shopping-cart-size");
        String teamName = context.getInitParameter("project-team-name");  
        
        // Step 4: generate HTML content
        out.println("<html><body>");
        out.println("Max cart: " + maxCartSize);
        out.println("<br/><br/>");
        out.println("Team name: " + teamName);
        out.println("<hr>");
        
        /*  Your servlet can not use Annotations for @WebServlet. It has to be manually configured in web.xml with <servlet> 
         *  and <servlet-mapping> tags, as shown above
         *  These params can only be read by the given servlet. If another servlet attempts to read the params then 
         *  they will get null.
         * */
        
        // READ PER-SERVLET parameter
        String theGreetingMessage = getInitParameter("greeting");
        String theServiceLevel = getInitParameter("serviceLevel");
        out.println("Per Servlet Params<br/><br/>");
        out.println("greeting: " + theGreetingMessage);
        out.println("<br/><br/>");
        out.println("serviceLevel: " + theServiceLevel);
        
        out.println("</body></html>");    
    }   
 }