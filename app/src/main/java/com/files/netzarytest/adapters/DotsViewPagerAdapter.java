package com.files.netzarytest.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.files.netzarytest.R;
import com.files.netzarytest.models.Item;

import java.util.List;


public class DotsViewPagerAdapter extends PagerAdapter {
    List<Item> datum;
    Context context;

    public DotsViewPagerAdapter(Context context, List<Item> datum) {
        this.datum = datum;
        this.context = context;
    }

    @Override
    public int getCount() {
        return datum.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.slide_page, container, false);
        container.addView(view);
        ImageView imageView = view.findViewById(R.id.slide_imgView);
        Glide.with(context).load(datum.get(position).getImage())
                .into(new SimpleTarget<Drawable>() {
                    @Override
                    public void onResourceReady(Drawable resource, Transition<? super Drawable> transition) {
                        imageView.setBackground(resource);
                    }
                });

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}