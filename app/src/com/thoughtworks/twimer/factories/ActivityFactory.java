package com.thoughtworks.twimer.factories;

import android.util.Log;
import com.thoughtworks.twimer.domain.Activity;
import org.json.JSONException;
import org.json.JSONObject;

public class ActivityFactory {
    public Activity parse(JSONObject object) throws JSONException {
        Log.e("factory", object.toString());

        boolean billable = false;
        try {
            billable = object.getBoolean("billable");
        } catch (JSONException e) {
            Log.d("ActivityFactory", "Billable was null, setting to false");
        }
        String client = object.getString("client");
        String project = object.getString("project");
        String subProject = object.getString("sub_project");
        return new Activity(billable, client, project, subProject);
    }
}