package app.model;

import app.entities.Feature;

import java.util.ArrayList;
import java.util.List;

public class FeatureModel {
    private static FeatureModel instance = new FeatureModel();

    private List<Feature> featureModel;

    public static FeatureModel getInstance() {
        return instance;
    }

    private FeatureModel() {
        featureModel = new ArrayList<>();
    }

    public void add(Feature feature) {
        featureModel.add(feature);
    }

    public List<Feature> featureList() {
        return featureModel;
    }

    public void editFeature(Feature feature, int n) {
        featureModel.set(n, feature);
    }

    public int getNumber() { return featureModel.size() + 1;}

    public Feature getFeatureByNumber(int n) {return featureModel.get(n);}
}
