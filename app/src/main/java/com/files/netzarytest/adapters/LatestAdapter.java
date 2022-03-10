package com.files.netzarytest.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.files.netzarytest.R;
import com.files.netzarytest.models.Item;

import java.util.List;

public class LatestAdapter extends RecyclerView.Adapter<LatestAdapter.MyViewHolder> {
    Context context;
    List<Item> items;
    int fav = 1;

    public LatestAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public LatestAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.latest_slide, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LatestAdapter.MyViewHolder holder, int position) {
        Glide.with(context).load(items.get(position).getThumbnail())
                .into(new SimpleTarget<Drawable>() {
                    @Override
                    public void onResourceReady(Drawable resource, Transition<? super Drawable> transition) {
                        holder.imageView.setBackground(resource);
                    }
                });
        double p = items.get(position).getPrice();
        holder.txtPrice.setText("\u20B9" + String.format("%.0f", p));
        holder.txtDetails.setText(items.get(position).getTitle());
        try {
            if (items.get(position).getAttributes().get(2).getUnit().equals(null)) {
                holder.txtDistance.setText(items.get(position).getAttributes().get(0).getValue());

            } else {
                holder.txtDistance.setText(items.get(position).getAttributes().get(2).getValue() + items.get(position).getAttributes().get(2).getUnit());
            }
        } catch (Exception e) {
            Log.e("errorr", e.toString());
            holder.txtMeter.setVisibility(View.GONE);
        }
        try {


            if (items.get(position).getAttributes().get(3).getUnit().equals(null)) {
                holder.txtMeter.setText(items.get(position).getAttributes().get(1).getValue());

            } else {
                holder.txtMeter.setText(items.get(position).getAttributes().get(3).getValue() + items.get(position).getAttributes().get(3).getUnit());
            }

        } catch (Exception e) {
            Log.e("errorr", e.toString());
            holder.txtMeter.setVisibility(View.GONE);
        }
        holder.txtLocation.setText(items.get(position).getLocality());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fav == 1) {
                    holder.button.setBackgroundResource(R.drawable.ic_favorite_filled);
                    fav = 0;
                } else {
                    holder.button.setBackgroundResource(R.drawable.ic_favorite_border);
                    fav = 1;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtPrice, txtDetails, txtDistance, txtMeter, txtLocation;
        ImageView imageView;
        ImageButton button;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtPrice = itemView.findViewById(R.id.rate);
            txtDetails = itemView.findViewById(R.id.title);
            txtDistance = itemView.findViewById(R.id.distance3);
            txtMeter = itemView.findViewById(R.id.distance4);
            txtLocation = itemView.findViewById(R.id.loc);
            imageView = itemView.findViewById(R.id.latest_imgView);
            button = itemView.findViewById(R.id.btnFav);
        }
    }
}