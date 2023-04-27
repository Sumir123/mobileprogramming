package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder> {

    RecyclerItemsDTO[] recyclerItemsDTOS;

    public RecyclerViewAdapter(RecyclerItemsDTO[] recyclerItemsDTOS) {
        this.recyclerItemsDTOS = recyclerItemsDTOS;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_item_layout, parent, false);
        viewHolder viewHolder = new viewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.viewHolder holder, int position) {
       holder.textView.setText(recyclerItemsDTOS[position].getLanguages());
        holder.imageView.setImageResource(recyclerItemsDTOS[position].getImages());

    }

    @Override
    public int getItemCount() {
        return recyclerItemsDTOS.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageRecyclerItem);
            this.textView = itemView.findViewById(R.id.tvRecyclerItem);
        }
    }
}
