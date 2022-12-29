package app.servlets;

import app.entities.Bug;
import app.model.BugModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BugsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BugModel bugModel = BugModel.getInstance();
        List<Bug> bugs = bugModel.bugList();
        req.setAttribute("bugs", bugs);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/bugs.jsp");
        requestDispatcher.forward(req, resp);
    }
}
