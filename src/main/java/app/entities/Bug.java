package app.entities;

public class Bug {
    private String name;
    private String executor;
    private String deadline;
    private String details;
    private String priority;
    private String status;

    private int number;

    public Bug(String name, String executor, String deadline, String details, String priority, int n, String status) {
        this.name = name;
        this.executor = executor;
        this.deadline = deadline;
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

    public void setDeadline(String deadline) {
        this.deadline = deadline;
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

    public String getDeadline() {
        return deadline;
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
