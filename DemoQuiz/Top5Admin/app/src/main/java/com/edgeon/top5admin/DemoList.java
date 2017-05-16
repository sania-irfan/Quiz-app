package com.edgeon.top5admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DemoList extends AppCompatActivity
{

    public ListView listview;
    public ArrayAdapter adapter;
    private static final ArrayList<String> names = new ArrayList<String>();
    private static final int[] images=new int[5];
    public static final String showText="Show_text";
    public static final String img="icon";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_list);

        listview = (ListView) findViewById(R.id.list);

        // names.add(new CategoryObj());
        names.add("sania");
        names.add("osama");
        names.add("saad");
        names.add("kanza");
        names.add("fiza");

//        images.add(R.drawable.animal);
//        images.add(R.drawable.fruits);

        images[0]=R.drawable.animal;
        images[1]=R.drawable.fruits;
        images[2]=R.drawable.bottle;
        images[3]=R.drawable.download;
        images[4]=R.drawable.hamburger2;

        adapter=new CategoryAdapter(this,names,images);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                int itemposition=position;

                String itemvalue=(String) listview.getItemAtPosition(itemposition);

                Intent gotoimage=new Intent(DemoList.this,Dashboard.class);
                gotoimage.putExtra(showText, itemvalue);

                gotoimage.putExtra(img,images[itemposition]);
                startActivityForResult(gotoimage,0);
//                Toast.makeText(getApplicationContext(),"Position: " + itemposition + "  ListItem: " + itemvalue, Toast.LENGTH_LONG).show();
            }
        });
   }
}

//        String[] values = new String[]{"Android List View",
//                "Adapter implementation",
//                "Simple List View In Android",
//                "Create List View Android",
//                "Android Example",
//                "List View Source Code",
//                "List View Array Adapter",
//                "Android Example List View"};
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, android.R.id.text1, values);
//
//        // Assign adapter to ListView
//        listview.setAdapter(adapter);
//
//        // ListView Item Click Listener
//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                // ListView Clicked item index
//                int itemPosition = position;
//
//                // ListView Clicked item value
//                String itemValue = (String) listview.getItemAtPosition(position);
//
//                // Show Alert
//                Toast.makeText(getApplicationContext(),
//                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG).show();
//            }
//        });