package com.thoughtworks.twimer.factories;

import com.thoughtworks.twimer.domain.TimeSheets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;

public class TimeSheetsFactory {
    private final TimeSheetFactory timeSheetFactory;

    public TimeSheetsFactory() {
        timeSheetFactory = new TimeSheetFactory();
    }

    public TimeSheets parse(String jsonResponse) {
        TimeSheets timeSheets = new TimeSheets();

        try {
            JSONArray array = new JSONArray(jsonResponse);
            for (int i = 0; i < array.length(); i++) {
                timeSheets.add(timeSheetFactory.parse((JSONObject) array.get(i)));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return timeSheets;
    }
}