package javalab;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Prog8 ")
public class Prog8 extends HttpServlet
{
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String userName = request.getParameter("username");
out.println("<html><body>");
out.println("<h1>Hello " + userName + "</h1>");
out.println("<p>How Are You?</p>");
out.println("</body></html>");
out.close();
}
}




<!DOCTYPE html>
<html>
<head>
<title>Greeting Form</title>
</head>
<body>
<h2>Enter your name:</h2>
<form action="Prog8" method="post">
<input type="text" name="username">
<input type="submit" value="Submit">
</form>
</body>
</html>
