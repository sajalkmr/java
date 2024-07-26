package javalab;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Prog9")
public class Prog9 extends HttpServlet 
{
private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String name = request.getParameter("name");
String usn = request.getParameter("usn");
int marks1 = Integer.parseInt(request.getParameter("marks1"));
int marks2 = Integer.parseInt(request.getParameter("marks2"));
int totalMarks = marks1 + marks2;
out.println("<html><body>");
out.println("<h2>Student Details:</h2>");
out.println("<p>Name: " + name + "</p>");
out.println("<p>USN: " + usn + "</p>");
out.println("<p>Total Marks: " + totalMarks + "</p>");
out.println("</body></html>");
} 
}





<!DOCTYPE html>
<html>
<head>
<title>Student Details </title>
</head>
<body>
<h2>Enter Student Details:</h2>
<form action="Prog9" method="post">
<label for="name">Name:</label>
<input type="text" id="name" name="name"><br><br>
<label for="usn">USN:</label>
<input type="text" id="usn" name="usn"><br><br>
<label for="marks1">Marks 1:</label>
<input type="number" id="marks1" name="marks1"><br><br>
<label for="marks2">Marks 2:</label>
<input type="number" id="marks2" name="marks2"><br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>




