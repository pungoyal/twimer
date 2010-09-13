package com.thoughtworks.twimer.factories;

import com.thoughtworks.twimer.domain.TimeSheet;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeSheetFactory {
    public TimeSheet parse(JSONObject jsonObject) throws JSONException, ParseException {
        long id = jsonObject.getLong("id");
        String billableHours = jsonObject.getString("billable_hours");
        String nonBillableHours = jsonObject.getString("non_billable_hours");
        Date date = parseDate(jsonObject);
        boolean submitted = jsonObject.get("status").equals("submitted");

        return new TimeSheet(id, billableHours, nonBillableHours, date, submitted);
    }

    private Date parseDate(JSONObject jsonObject) throws JSONException, ParseException {
        String dateString = jsonObject.getString("format_week_ending_date");
        SimpleDateFormat parserSDF = new SimpleDateFormat("dd-MMM-yyyy");
        return parserSDF.parse(dateString);
    }
}