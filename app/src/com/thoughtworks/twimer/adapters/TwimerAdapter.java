package com.thoughtworks.twimer.adapters;

import android.widget.BaseAdapter;

import java.util.ArrayList;

public abstract class TwimerAdapter<T> extends BaseAdapter {
    protected ArrayList<T> list;

    public TwimerAdapter(ArrayList<T> list) {
        this.list = list;
    }

    public int getCount() {
        return list.size();
    }

    public Object getItem(int i) {
        return list.get(i);
    }

    public long getItemId(int i) {
        return i;
    }
}