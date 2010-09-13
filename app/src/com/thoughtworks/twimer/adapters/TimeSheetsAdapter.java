package com.thoughtworks.twimer.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.thoughtworks.twimer.domain.TimeSheet;
import com.thoughtworks.twimer.views.TimeSheetView;

import java.util.ArrayList;

public class TimeSheetsAdapter extends TwimerAdapter<TimeSheet> {
    private Context context;

    public TimeSheetsAdapter(Context context, ArrayList<TimeSheet> timeSheets) {
        super(timeSheets);
        this.context = context;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return new TimeSheetView(context, list.get(i));
    }
}