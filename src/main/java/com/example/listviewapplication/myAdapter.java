package com.example.listviewapplication;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by parsian pc on 10/25/2020.
 */
public class myAdapter extends ArrayAdapter<User> {
    public ArrayList<User> users;
    public myAdapter(Context context, int resource,ArrayList<User> users) {
        super(context, 0,users);
        this.users=users;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        User user=users.get(position);
        View rowView=convertView;
        ImageView iv;
        TextView tvu,tvp,tve;
        if(convertView==null){
            rowView= LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
            iv = (ImageView) rowView.findViewById(R.id.iv);
            tvu = (TextView) rowView.findViewById(R.id.tvu);
            tvp = (TextView) rowView.findViewById(R.id.tvp);
            tve = (TextView) rowView.findViewById(R.id.tve);
            ViewHolder viewHolder=new ViewHolder(iv,tvu,tvp,tve);
            rowView.setTag(viewHolder);
        }else{
            rowView=convertView;
            ViewHolder viewHolder=(ViewHolder)rowView.getTag();
            iv=viewHolder.iv;
            tvu=viewHolder.tvu;
            tve=viewHolder.tve;
            tvp=viewHolder.tvp;
        }

        iv.setImageResource(user.imageSource);
        tvu.setText(user.username);
        tvp.setText("Phone = "+user.phoneNumber);
        tve.setText("Email = "+user.emailAddress);
        return rowView;
    }
}
