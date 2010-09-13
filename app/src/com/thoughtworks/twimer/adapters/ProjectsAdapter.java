package com.thoughtworks.twimer.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.thoughtworks.twimer.domain.Activities;
import com.thoughtworks.twimer.views.ActivityView;

public class ProjectsAdapter extends BaseAdapter {
    private Context context;
    private Activities activities;

    public ProjectsAdapter(Context context, Activities activities) {
        this.context = context;
        this.activities = activities;
    }

    public int getCount() {
        return activities.size();
    }

    public Object getItem(int i) {
        return activities.get(i);
    }

    public long getItemId(int i) {
        return i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return new ActivityView(context, activities.get(i));
    }
}