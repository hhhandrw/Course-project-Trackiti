package app.model;

import app.entities.Bug;

import java.util.ArrayList;
import java.util.List;

public class BugModel {
    private static BugModel instance = new BugModel();

    private List<Bug> bugModel;

    public static BugModel getInstance() {
        return instance;
    }

    private BugModel() {
        bugModel = new ArrayList<>();
    }

    public void add(Bug bug) {
        bugModel.add(bug);
    }

    public List<Bug> bugList() {
        return bugModel;
    }

    public void editBug(Bug bug, int n) {
        bugModel.set(n, bug);
    }

    public int getNumber() { return bugModel.size() + 1;}

    public Bug getBugByNumber(int n) {return bugModel.get(n);}
}
