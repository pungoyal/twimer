package com.thoughtworks.twimer.views;

import android.content.Context;
import android.widget.LinearLayout;
import com.thoughtworks.twimer.domain.TimeSheet;

public class TimeSheetView extends LinearLayout {
    public TimeSheetView(Context context, TimeSheet timeSheet) {
        super(context);
        setOrientation(VERTICAL);

//        TextView client = new TextView(context);
//        client.setText(timeSheet.getClient());
//        client.setTextColor(Color.BLUE);
//        addView(client, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
//
//        TextView billable = new TextView(context);
//        billable.setText(String.valueOf(timeSheet.getBillable()));
//        billable.setTextColor(Color.RED);
//        billable.setTextSize(8);
//        addView(billable, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
//
//        TextView date = new TextView(context);
//        date.setText(timeSheet.getProject());
//        date.setTextColor(Color.WHITE);
//        date.setTextSize(10);
//        addView(date, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
    }
}