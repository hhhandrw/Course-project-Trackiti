package app.servlets;

import app.entities.Bug;
import app.entities.Realized;
import app.model.BugModel;
import app.model.RealizedModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SendBugToRealizedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/sendBugToRealized.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int number = Integer.parseInt(req.getParameter("number")) - 1;
        BugModel bugModel = BugModel.getInstance();
        Bug bug = bugModel.getBugByNumber(number);
        Realized realized = new Realized("Bug", bug.getName(), bug.getExecutor(), bug.getDetails());
        RealizedModel realizedModel = RealizedModel.getInstance();
        realizedModel.add(realized);

        req.setAttribute("realized", realized);
        doGet(req, resp);
    }
}
