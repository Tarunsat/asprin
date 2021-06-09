package com.example.testlist;

import android.widget.ListView;

public class ItemValues {


    private int a = 0;
    private int p;
    private int b = 0;

    private String name;
    private int imageResourceId;

    ListView items;

    public ItemValues(String nam, int imageresourceId)
    {
        name=nam;

        imageResourceId=imageresourceId;
    }

    public String getname()
    {
        return name;
    }

    public int getimage()
    {
        return imageResourceId;
    }



}