package app.model;

import app.entities.Realized;

import java.util.ArrayList;
import java.util.List;

public class RealizedModel {
    private static RealizedModel instance = new RealizedModel();

    private List<Realized> realizedModel;

    public static RealizedModel getInstance() {
        return instance;
    }

    private RealizedModel() {
        realizedModel = new ArrayList<>();
    }

    public void add(Realized realized) {
        realizedModel.add(realized);
    }

    public List<Realized> realizedList() {
        return realizedModel;
    }
}
