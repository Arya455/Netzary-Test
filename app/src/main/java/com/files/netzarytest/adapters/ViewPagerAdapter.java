package com.files.netzarytest.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.files.netzarytest.R;
import com.files.netzarytest.models.BackgroundImage;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    List<BackgroundImage> backgroundImages;



    public ViewPagerAdapter(Context context, List<BackgroundImage> backgroundImages) {
        this.backgroundImages = backgroundImages;
        this.context = context;
    }

    @Override
    public int getCount() {
        return backgroundImages.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.slide_layout, container, false);
        container.addView(view);
        ImageView imageView = view.findViewById(R.id.imageView);
        Glide.with(context).load(backgroundImages.get(position).getImage()).into(imageView);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}