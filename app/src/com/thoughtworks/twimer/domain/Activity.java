package com.thoughtworks.twimer.domain;

public class Activity {
    private Entity client;
    private boolean billable;
    private Entity project;
    private Entity subProject;

    public Activity(boolean billable, Entity client, Entity project, Entity subProject) {
        this.billable = billable;
        this.client = client;
        this.project = project;
        this.subProject = subProject;
    }

    public String getClient() {
        return client.getName();
    }

    public boolean getBillable() {
        return billable;
    }

    public String getProject() {
        return project.getName();
    }

    public String getSubProject() {
        return subProject.getName();
    }
}