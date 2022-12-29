package app.entities;

public class Realized {
    private String type;
    private String name;
    private String executor;
    private String details;

    public Realized(String type, String name, String executor, String details) {
        this.type = type;
        this.name = name;
        this.executor = executor;
        this.details = details;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getExecutor() {
        return executor;
    }

    public String getDetails() {
        return details;
    }
}
