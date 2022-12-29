package app.servlets;

import app.entities.Bug;
import app.entities.Feature;
import app.entities.Realized;
import app.model.BugModel;
import app.model.FeatureModel;
import app.model.RealizedModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SendFeatureToRealizedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/sendFeatureToRealized.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int number = Integer.parseInt(req.getParameter("number")) - 1;
        FeatureModel featureModel = FeatureModel.getInstance();
        Feature feature = featureModel.getFeatureByNumber(number);
        Realized realized = new Realized("Feature", feature.getName(), feature.getExecutor(), feature.getDetails());
        RealizedModel realizedModel = RealizedModel.getInstance();
        realizedModel.add(realized);

        req.setAttribute("realized", realized);
        doGet(req, resp);
    }
}