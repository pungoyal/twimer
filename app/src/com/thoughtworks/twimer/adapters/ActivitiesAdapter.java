package com.thoughtworks.twimer.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.thoughtworks.twimer.domain.Activities;
import com.thoughtworks.twimer.domain.Activity;
import com.thoughtworks.twimer.views.ActivityView;

public class ActivitiesAdapter extends TwimerAdapter<Activity> {
    private Context context;

    public ActivitiesAdapter(Context context, Activities activities) {
        super(activities);
        this.context = context;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return new ActivityView(context, list.get(i));
    }
}