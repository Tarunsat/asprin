package com.example.testlist;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toolbar;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvSpinner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvSpinner = (ListView) findViewById(R.id.listview_spinner);

        ArrayList<String> mData = new ArrayList<>();
        mData.add("Halo 4");
        mData.add("Halo 2");
        mData.add("Nasa");
        mData.add("Blade Runner");

        ArrayList<Integer> imagesource = new ArrayList<>();
        imagesource.add(R.drawable.h4);
        imagesource.add(R.drawable.h2);
        imagesource.add(R.drawable.nasa);
        imagesource.add(R.drawable.bladerunner);


        ArrayList<String> mSpinnerData = new ArrayList<>();
        mSpinnerData.add("720p");
        mSpinnerData.add("1080p");
        mSpinnerData.add("4k");

        BasicSpinnerAdapter adapter = new BasicSpinnerAdapter(imagesource, mData, mSpinnerData, this);
        lvSpinner.setAdapter(adapter);




    }
    public void gotoAccount(View view){
        Intent i = new Intent(this, AccountActivity.class);
        startActivity(i);
    }
    public void gotoCart(View view){
        Intent i = new Intent(this, TotalCostActivity.class);
        startActivity(i);
    }
}