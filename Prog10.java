package javalab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Prog10")
public class Prog10 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("EMPID", "AN2356");
        cookie.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie);
        
        response.setContentType("text/html");
        response.getWriter().println("Cookie created with name EMPID and value AN2356");
    }
}










import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Prog10b")
public class Prog10b extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String empidValue = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("EMPID")) {
                    empidValue = cookie.getValue();
                    break;
                }
            }
        }

        response.setContentType("text/html");
        if (empidValue != null) {
            response.getWriter().println("Cookie EMPID found with value: " + empidValue);
        } else {
            response.getWriter().println("Cookie EMPID not found.");
        }
    }
}








<!DOCTYPE html>
<head>
 <title>Cookie Example</title>
</head>
<body>
 <h1>Cookie Example</h1>
 
 <h2>Create Cookie</h2>
 <form action="Prog10" method="post">
 <input type="submit" value="Create EMPID Cookie">
 </form>
 
 <h2>Read Cookie</h2>
 <form action="Prog10b" method="get">
 <input type="submit" value="Read EMPID Cookie">
 </form>
</body>
</html>



