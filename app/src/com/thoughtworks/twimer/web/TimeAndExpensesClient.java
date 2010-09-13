package com.thoughtworks.twimer.web;

import android.util.Log;
import com.thoughtworks.twimer.domain.Activities;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

public class TimeAndExpensesClient {
    private DefaultHttpClient httpClient;
    private final String activitiesUrl = "http://10.0.2.2:3000/activities.json";

    public TimeAndExpensesClient() {
        httpClient = new DefaultHttpClient();
    }

    public Activities getActivities() {
        String jsonResponse = "";
        try {
            jsonResponse = Http.get(activitiesUrl).use(httpClient).asString();
        } catch (IOException e) {

        }
        Log.d("client", jsonResponse);

        return new Activities();
    }

}