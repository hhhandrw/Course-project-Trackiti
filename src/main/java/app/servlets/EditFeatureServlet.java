package app.servlets;

import app.entities.Bug;
import app.entities.Feature;
import app.model.BugModel;
import app.model.FeatureModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditFeatureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/editFeature.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int number = Integer.parseInt(req.getParameter("number")) - 1;
        FeatureModel featureModel = FeatureModel.getInstance();
        Feature feature = featureModel.getFeatureByNumber(number);
        String name = req.getParameter("name");
        String executor = req.getParameter("executor");
        String details = req.getParameter("details");
        String priority = req.getParameter("priority");
        String status = req.getParameter("status");

        if (!name.equals("")) {
            feature.setName(name);
        }
        if (!executor.equals("")) {
            feature.setExecutor(executor);
        }
        if (!details.equals("")) {
            feature.setDetails(details);
        }
        if (!priority.equals("")) {
            feature.setPriority(priority);
        }
        if (!status.equals("")) {
            feature.setStatus(status);
        }

        featureModel.editFeature(feature, number);

        req.setAttribute("feature", feature);
        doGet(req, resp);
    }
}
