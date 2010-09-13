package com.thoughtworks.twimer.domain;

public class Activity {
    private String client;
    private boolean billable;
    private String projectName;

    public String getClient() {
        return client;
    }

    public boolean getBillable() {
        return billable;
    }

    public String getProjectName() {
        return projectName;
    }
}