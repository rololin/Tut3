package com.svc.tut3.tut3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by shyam on 1/14/15.
 */
public class MyAdapter extends ArrayAdapter<String>{
    public MyAdapter(Context context, String [] values) {
        super(context, R.layout.rowlayout2,values);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflator = LayoutInflater.from(getContext());

        View theView = theInflator.inflate(R.layout.rowlayout2, parent, false);

        String tvshow = getItem(position);
        TextView thetextView = (TextView) theView.findViewById(R.id.TextView1);

        thetextView.setText(tvshow);
        ImageView theImageView = (ImageView) theView.findViewById(R.id.DotID);
        theImageView.setImageResource(R.drawable.dot);

        return theView;
    }
}
