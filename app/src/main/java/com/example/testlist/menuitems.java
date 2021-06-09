package com.example.testlist;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class menuitems extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.bottom_nav_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
        case R.id.action_cart:
            Intent i = new Intent(this, TotalCostActivity.class);
            startActivity(i);
            return true;
        case R.id.action_shop:
            Intent j = new Intent(this, MainActivity.class);
            startActivity(j);
            return true;
        case R.id.action_account:
            Intent k = new Intent(this, AccountActivity.class);
            startActivity(k);
            return true;


    }
        return(super.onOptionsItemSelected(item));
    }
}


