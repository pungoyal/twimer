package com.thoughtworks.twimer.factories;

import com.thoughtworks.twimer.domain.Activities;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ActivitiesFactory {
    private final ActivityFactory activityFactory;

    public ActivitiesFactory() {
        activityFactory = new ActivityFactory();
    }

    public Activities parse(String jsonResponse) {
        Activities activities = new Activities();

        try {
            JSONArray array = new JSONArray(jsonResponse);
            for (int i = 0; i < array.length(); i++) {
                activities.add(activityFactory.parse((JSONObject) array.get(i)));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return activities;
    }
}
