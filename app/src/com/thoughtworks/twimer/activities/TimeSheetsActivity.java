package com.thoughtworks.twimer.activities;

import android.app.ListActivity;
import android.os.Bundle;
import com.thoughtworks.twimer.adapters.TimeSheetsAdapter;
import com.thoughtworks.twimer.domain.TimeSheets;
import com.thoughtworks.twimer.web.TimeAndExpensesClient;

public class TimeSheetsActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TimeAndExpensesClient client = new TimeAndExpensesClient();
        TimeSheets timeSheets = client.getTimeSheets();

        setListAdapter(new TimeSheetsAdapter(this, timeSheets));
    }
}