package com.thoughtworks.twimer.factories;

import android.util.Log;
import com.thoughtworks.twimer.domain.Activity;
import com.thoughtworks.twimer.domain.Entity;
import org.json.JSONException;
import org.json.JSONObject;

public class ActivityFactory {
    public Activity parse(JSONObject object) throws JSONException {
        Log.e("factory", object.toString());

        boolean billable = parseBillable(object);

        Entity client = new Entity(object.getString("client"), object.getString("client_name"));
        Entity project = new Entity(object.getString("project"), object.getString("project_name"));
        Entity subProject = new Entity(object.getString("sub_project"), object.getString("sub_project_name"));

        return new Activity(billable, client, project, subProject);
    }

    private boolean parseBillable(JSONObject object) {
        boolean billable = false;
        try {
            billable = object.getBoolean("billable");
        } catch (JSONException e) {
            Log.d("ActivityFactory", "Billable was null, setting to false");
        }
        return billable;
    }
}