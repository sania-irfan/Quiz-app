package com.edgeon.top5admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        String country=getIntent().getStringExtra(DemoList.showText);
        TextView items=(TextView)findViewById(R.id.items);
        items.setText(country);

        int imageId=getIntent().getIntExtra(DemoList.img,0);
        ImageView iv=(ImageView)findViewById(R.id.fork);
        iv.setImageResource(imageId);


        //Intent intent=new Intent(this,DemoList.class);

        //home=(Button)findViewById(R.id.home);

//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent gotohome=new Intent(Dashboard.this,Home.class);
//
//                startActivity(gotohome);
//            }
//        });
    }
}
