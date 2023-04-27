package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GirdViewAdapter extends BaseAdapter {

    Context mContext;
    String[] plang;
    int[] imageItem;

    LayoutInflater layoutInflater;

    public GirdViewAdapter(Context context, String[] programmingLang, int[] images) {
        this.mContext = context;
        this.plang = programmingLang;
        this.imageItem = images;
        layoutInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return plang.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view =layoutInflater.inflate(R.layout.grid_item_layout,null);
        TextView textView = view.findViewById(R.id.tvItemGrid);
        ImageView imageView = view.findViewById(R.id.imageItemGrid);
        textView.setText(plang[i]);
        imageView.setImageResource(imageItem[i]);
        return view;
    }
}
