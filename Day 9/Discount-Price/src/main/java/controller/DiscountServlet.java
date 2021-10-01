package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/product-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.write("Do Get");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        int discountAmount = Integer.parseInt(request.getParameter("discount"));
        double price = Double.parseDouble(request.getParameter("price"));
        double discountPrice = price * discountAmount * 0.01;
        printWriter.write("<h1>Display Discount</h1>");
        printWriter.write("<p>Discount Amount:" + discountAmount + "</p>");
        printWriter.write("<p>Discount Price:" + discountPrice + "</p>");
    }
}