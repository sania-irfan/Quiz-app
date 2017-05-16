package com.edgeon.top5admin;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.ArrayList;

/**
 * Created by sania on 19/09/2016.
 */
public class CategoryAdapter extends ArrayAdapter<String> {

    private Activity activity;
    Context context;
    ArrayList<String> obj;
    public static int[] obj2;

    public CategoryAdapter(Activity context, ArrayList<String> obj,int[] obj2) {

        super(context,R.layout.activity_home, obj);
        this.activity = context;
        this.obj = obj;
        this.obj2=obj2;
    }

    static class ViewHolder {

        public TextView text;
        public ImageView image;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View vi = convertView;

        if (vi == null) {

            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vi = inflater.inflate(R.layout.activity_home, parent, false);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.text = (TextView) vi.findViewById(R.id.BK);
            viewHolder.image=(ImageView) vi.findViewById(R.id.pic);
            context = parent.getContext();
            vi.setTag(viewHolder);
        }

        ViewHolder holder = (ViewHolder) vi.getTag();
        holder.text.setText(obj.get(position));
        holder.image.setImageResource(obj2[position]);
        //holder.image.setImageResource(obj2.get(position));
        return vi;
    }
}


