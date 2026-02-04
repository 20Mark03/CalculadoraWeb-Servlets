package javapackage;

import Calculadora.Calculadora;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operacion = request.getParameter("operacion");

        double resultado = Calculadora.calcular(num1, num2, operacion);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Resultado de la operación</h2>");
        out.println("<p>Número 1: " + num1 + "</p>");
        out.println("<p>Número 2: " + num2 + "</p>");
        out.println("<p>Operación: " + operacion + "</p>");
        out.println("<h3>Resultado: " + resultado + "</h3>");
        out.println("<a href='calculadora.html'>Volver</a>");
        out.println("</body></html>");
    }
}
