package com.thoughtworks.twimer.views;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.thoughtworks.twimer.domain.Activity;

public class ActivityView extends LinearLayout {
    public ActivityView(Context context, Activity activity) {
        super(context);

        setOrientation(VERTICAL);

        TextView client = new TextView(context);
        client.setText(activity.getClient());
        client.setTextColor(Color.BLUE);
        addView(client, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));

        TextView billable = new TextView(context);
        billable.setText(String.valueOf(activity.getBillable()));
        billable.setTextColor(Color.RED);
        billable.setTextSize(18);
        addView(billable, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));

        TextView date = new TextView(context);
        date.setText(activity.getProject());
        date.setTextColor(Color.argb(255, 136, 136, 136));
        date.setTextSize(10);
        addView(date, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));

    }
}