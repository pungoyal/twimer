package com.thoughtworks.twimer.activities;

import android.app.ListActivity;
import android.os.Bundle;
import com.thoughtworks.twimer.adapters.ProjectsAdapter;
import com.thoughtworks.twimer.domain.Activities;
import com.thoughtworks.twimer.web.TimeAndExpensesClient;

public class ActivityActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TimeAndExpensesClient client = new TimeAndExpensesClient();
        Activities activities = client.getProjects();

        setListAdapter(new ProjectsAdapter(this, activities));
    }
}