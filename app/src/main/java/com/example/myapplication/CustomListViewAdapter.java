package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListViewAdapter extends BaseAdapter {
    Context mContext;
    String[] plang;
    int[] cImages;

    LayoutInflater layoutInflater;

    public CustomListViewAdapter(Context context, String[] programmingLang, int[] images) {
        this.mContext = context;
        this.plang = programmingLang;
        this.cImages = images;
        layoutInflater=(LayoutInflater.from(context));
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
        view = layoutInflater.inflate(R.layout.layout_list_item,null);
        TextView textView =view.findViewById(R.id.tvListItem);
        ImageView imageView = view.findViewById(R.id.imageListItem);
        textView.setText(plang[i]);
        imageView.setImageResource(cImages[i]);
        return view;
    }
}
