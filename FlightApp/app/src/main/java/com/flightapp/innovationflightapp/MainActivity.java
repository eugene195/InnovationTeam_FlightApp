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

    private Button page1, page2, page3, page4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        page1 = (Button)findViewById(R.id.page1);
        page1.setOnClickListener(this);
        page2 = (Button) findViewById(R.id.page2);
        page2.setOnClickListener(this);
        page3 = (Button) findViewById(R.id.page3);
        page3.setOnClickListener(this);
        page4 = (Button) findViewById(R.id.page4);
        page4.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        final Context context=this;
        switch(v.getId())
        {
            case R.id.page1: {
                Intent i = new Intent(context, FlightList.class);
                startActivity(i);
                break;
            }
            case R.id.page2: {
                Intent i = new Intent(context, FlightList.class);
                startActivity(i);
                break;
            }
        }
    }
}
