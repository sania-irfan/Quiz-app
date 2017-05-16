package com.edgeon.top5admin;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Home extends AppCompatActivity {

    TextView head;
    Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itemdetails);

        tb = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(tb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Typeface regular = Typeface.createFromAsset(getAssets(), "fonts/roboto-condensed.regular.ttf");
        //Typeface bold=Typeface.createFromAsset(getAssets(),"fonts/roboto-condensed.bold.ttf");

        head = (TextView) findViewById(R.id.head);
        TextView category = (TextView) findViewById(R.id.category);
        TextView uname = (TextView) findViewById(R.id.username);
        TextView info = (TextView) findViewById(R.id.info);
        TextView accept = (TextView) findViewById(R.id.accept);
        TextView decline = (TextView) findViewById(R.id.decline);
        head.setTypeface(regular);
        category.setTypeface(regular);
        uname.setTypeface(regular);
        info.setTypeface(regular);
        accept.setTypeface(regular);
        decline.setTypeface(regular);

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDashboard = new Intent(Home.this, Dashboard.class);
                startActivity(goToDashboard);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // go to previous screen when app icon in action bar is clicked
                Intent intent = new Intent(this, Dashboard.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//
//            case R.id.home:
//                NavUtils.navigateUpFromSameTask(this);
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

