package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(
            "<!doctype html><html><head><title>Maven Web Demo</title></head>" +
            "<body><h1>Hello from Maven Web!</h1>" +
            "<p>This Java web application was built with Maven and deployed on Tomcat.</p>" +
            "</body></html>"
        );
    }
}
