package com.thoughtworks.twimer.views;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.thoughtworks.twimer.domain.TimeSheet;

public class TimeSheetView extends LinearLayout {
    public TimeSheetView(Context context, TimeSheet timeSheet) {
        super(context);
        setOrientation(VERTICAL);

        TextView client = new TextView(context);
        client.setText(timeSheet.getWeekEndingDate("dd/MM"));
        client.setTextColor(Color.WHITE);
        client.setTextSize(9);
        addView(client, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));

        TextView billable = new TextView(context);
        billable.setText(String.valueOf(timeSheet.getBillableHours()));
        billable.setTextColor(Color.GREEN);
        addView(billable, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

        TextView date = new TextView(context);
        date.setText(timeSheet.getNonBillableHours());
        date.setTextColor(Color.RED);
        addView(date, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
    }
}