package com.thoughtworks.twimer.factories;

import com.thoughtworks.twimer.domain.Activities;

public class ActivitiesFactory {
    public Activities parse(String jsonResponse) {

        return new Activities();
    }
}