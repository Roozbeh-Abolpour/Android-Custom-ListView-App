package com.example.listviewapplication;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by parsian pc on 10/25/2020.
 */
public  class  ViewHolder {
    public ImageView iv;
    public TextView tvu,tvp,tve;
    public ViewHolder(ImageView iv,TextView tvu,TextView tvp,TextView tve){
        this.iv=iv;
        this.tvu=tvu;
        this.tve=tve;
        this.tvp=tvp;
    }
}
