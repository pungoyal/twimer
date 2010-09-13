package com.thoughtworks.twimer.domain;

public class Activity {
    private String client;
    private boolean billable;
    private String project;
    private String subProject;

    public Activity(boolean billable, String client, String project, String subProject) {
        this.billable = billable;
        this.client = client;
        this.project = project;
        this.subProject = subProject;
    }

    public String getClient() {
        return client;
    }

    public boolean getBillable() {
        return billable;
    }

    public String getProject() {
        return project;
    }

    public boolean isBillable() {
        return billable;
    }

    public String getSubProject() {
        return subProject;
    }
}