package app.servlets;

import app.entities.Bug;
import app.model.BugModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditBugServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/editBug.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int number = Integer.parseInt(req.getParameter("number")) - 1;
        BugModel bugModel = BugModel.getInstance();
        Bug bug = bugModel.getBugByNumber(number);
        String name = req.getParameter("name");
        String executor = req.getParameter("executor");
        String deadline = req.getParameter("deadline");
        String details = req.getParameter("details");
        String priority = req.getParameter("priority");
        String status = req.getParameter("status");

        if (!name.equals("")) {
            bug.setName(name);
        }
        if (!executor.equals("")) {
            bug.setExecutor(executor);
        }
        if (!deadline.equals("")) {
            bug.setDeadline(deadline);
        }
        if (!details.equals("")) {
            bug.setDetails(details);
        }
        if (!priority.equals("")) {
            bug.setPriority(priority);
        }
        if (!status.equals("")) {
            bug.setStatus(status);
        }

        bugModel.editBug(bug, number);

        req.setAttribute("bug", bug);
        doGet(req, resp);
    }
}
