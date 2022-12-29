package app.entities;

public class Feature {
    private String name;
    private String executor;
    private String details;
    private String priority;
    private String status;
    private int number;

    public Feature(String name, String executor, String details, String priority, int n, String status) {
        this.name = name;
        this.executor = executor;
        this.details = details;
        this.priority = priority;
        this.number = n;
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setPriority(String priority) {
        this.priority = priority;
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

    public String getPriority() {
        return priority;
    }

    public int getNumber() {
        return number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
