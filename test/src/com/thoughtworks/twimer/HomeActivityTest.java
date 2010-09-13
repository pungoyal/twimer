package com.thoughtworks.twimer;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.thoughtworks.twimer.HomeActivityTest \
 * com.thoughtworks.twimer.tests/android.test.InstrumentationTestRunner
 */
public class HomeActivityTest extends ActivityInstrumentationTestCase2<HomeActivity> {

    public HomeActivityTest() {
        super("com.thoughtworks.twimer", HomeActivity.class);
    }

}
