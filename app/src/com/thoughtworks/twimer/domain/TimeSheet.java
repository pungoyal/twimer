package com.thoughtworks.twimer.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeSheet {
    private long id;
    private String billableHours;
    private String nonBillableHours;
    private Date weekEndingDate;
    private boolean submitted;

    public TimeSheet(long id, String billableHours, String nonBillableHours, Date weekEndingDate, boolean submitted) {

        this.id = id;
        this.billableHours = billableHours;
        this.nonBillableHours = nonBillableHours;
        this.weekEndingDate = weekEndingDate;
        this.submitted = submitted;
    }

    public Date getWeekEndingDate() {
        return weekEndingDate;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public String getNonBillableHours() {
        return nonBillableHours;
    }

    public String getBillableHours() {
        return billableHours;
    }

    public String getWeekEndingDate(String format) {
        return new SimpleDateFormat(format).format(weekEndingDate);
    }
}