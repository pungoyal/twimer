package com.thoughtworks.twimer.activities;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Window;
import com.thoughtworks.twimer.adapters.ActivitiesAdapter;
import com.thoughtworks.twimer.domain.Activities;
import com.thoughtworks.twimer.web.TimeAndExpensesClient;

public class ActivityActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        TimeAndExpensesClient client = new TimeAndExpensesClient();
        Activities activities = client.getActivities();

        setListAdapter(new ActivitiesAdapter(this, activities));
    }
}