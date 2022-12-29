package app.servlets;

import app.entities.Realized;
import app.model.RealizedModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class RealizedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RealizedModel realizedModel = RealizedModel.getInstance();
        List<Realized> realizedList = realizedModel.realizedList();
        req.setAttribute("realizedList", realizedList);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/realized.jsp");
        requestDispatcher.forward(req, resp);
    }
}
