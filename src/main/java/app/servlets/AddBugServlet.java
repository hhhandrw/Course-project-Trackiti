package app.servlets;

import app.entities.Bug;
import app.model.BugModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddBugServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/addBug.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String executor = req.getParameter("executor");
        String deadline = req.getParameter("deadline");
        String details = req.getParameter("details");
        String priority = req.getParameter("priority");
        String status = req.getParameter("status");
        BugModel bugModel = BugModel.getInstance();
        int number = bugModel.getNumber();
        Bug bug = new Bug(name, executor, deadline, details, priority, number, status);
        bugModel.add(bug);

        req.setAttribute("bug", bug);
        doGet(req, resp);
    }
}