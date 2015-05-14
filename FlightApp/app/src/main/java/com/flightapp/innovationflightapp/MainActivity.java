package com.flightapp.innovationflightapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener {

    private Button searchBtn, favBtn, flightsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBtn = (Button)findViewById(R.id.page1);
        searchBtn.setOnClickListener(this);
        favBtn = (Button) findViewById(R.id.page2);
        favBtn.setOnClickListener(this);
        flightsBtn = (Button) findViewById(R.id.page3);
        flightsBtn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        final Context context = this;
        switch(v.getId())
        {
            case R.id.page1: {
                Intent i = new Intent(context, SearchFlightActivity.class);
                startActivity(i);
                break;
            }
            case R.id.page2: {
                Intent i = new Intent(context, FavouritesActivity.class);
                startActivity(i);
                break;
            }
        }
    }
}
