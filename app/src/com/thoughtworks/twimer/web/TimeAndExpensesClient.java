package com.thoughtworks.twimer.web;

import android.util.Log;
import com.thoughtworks.twimer.domain.Activities;
import com.thoughtworks.twimer.domain.TimeSheets;
import com.thoughtworks.twimer.factories.ActivitiesFactory;
import com.thoughtworks.twimer.factories.TimeSheetsFactory;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

public class TimeAndExpensesClient {
    private DefaultHttpClient httpClient;
    private static final String SERVER = "http://10.0.2.2:3000";
    private final String ACTIVITIES_SLUG = "/activities.json";
    private final String TIMESHEETS_SLUG = "/time_sheets.json";

    public TimeAndExpensesClient() {
        httpClient = new DefaultHttpClient();
    }

    public Activities getActivities() {
        String jsonResponse = getResponseJson(ACTIVITIES_SLUG);
        return new ActivitiesFactory().parse(jsonResponse);
    }

    public TimeSheets getTimeSheets() {
        String jsonResponse = getResponseJson(TIMESHEETS_SLUG);
        return new TimeSheetsFactory().parse(jsonResponse);
    }

    private String getResponseJson(String slug) {
        String jsonResponse = "[]";
        try {
            jsonResponse = Http.get(SERVER + slug).use(httpClient).asString();
            Log.d("client", jsonResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonResponse;
    }
}