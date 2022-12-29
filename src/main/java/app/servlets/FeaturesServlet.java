package app.servlets;

import app.entities.Feature;
import app.model.FeatureModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FeaturesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FeatureModel featureModel = FeatureModel.getInstance();
        List<Feature> features = featureModel.featureList();
        req.setAttribute("features", features);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/features.jsp");
        requestDispatcher.forward(req, resp);
    }
}
