package edu.mum.cs.cs472.labs;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<form action=\"calculate\" method=\"post\" >");
        out.println("<br></br>");
        String add1 = req.getParameter("add1");
        String add2 = req.getParameter("add2");
        String mult1 = req.getParameter("mult1");
        String mult2 = req.getParameter("mult2");
        if(!add1.equals("") && !add2.equals("")){
            int sum = Integer.valueOf(add1) + Integer.valueOf(add2);
            out.println("<input type=\"text\" name=\"add1\" value=\"" + add1 + "\"> + <input type=\"text\" name=\"add2\" value=\"" + add2 +"\"> = <input type=\"text\" name=\"sum\" value=\"" + sum +"\">");
        }
        else{
            out.println("<input type=\"text\" name=\"add1\"> + <input type=\"text\" name=\"add2\"> = <input type=\"text\" name=\"sum\">");
        }
        out.println("<br></br>");
        if(!mult1.equals("") && !mult2.equals("")){
            int product = Integer.valueOf(mult1) * Integer.valueOf(mult2);
            out.println("<input type=\"text\" name=\"mult1\" value=\"" + mult1 + "\"> * <input type=\"text\" name=\"mult2\" value=\"" + mult2 +"\"> = <input type=\"text\" name=\"product\" value=\" " + product +"\">");
        }
        else{
            out.println(" <input type=\"text\" name=\"mult1\"> * <input type=\"text\" name=\"mult2\"> = <input type=\"text\" name=\"product\">");
        }

        out.println("<br></br>");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
