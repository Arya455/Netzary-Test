package com.files.netzarytest;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.files.netzarytest.adapters.CustomAdapter;
import com.files.netzarytest.adapters.DotsViewPagerAdapter;
import com.files.netzarytest.adapters.LatestAdapter;
import com.files.netzarytest.adapters.ViewPagerAdapter;
import com.files.netzarytest.models.BackgroundImage;
import com.files.netzarytest.models.Item;
import com.files.netzarytest.models.ResMain;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {

    final long DELAY_MS = 500;
    final long PERIOD_MS = 3000;
    ViewPager viewPager, viewPager2;
    SpringDotsIndicator springDotsIndicator;
    RecyclerView recyclerView, RCycleView;
    List<Item> items;
    int currentPage = 0;
    Timer timer;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        viewPager = view.findViewById(R.id.viewPager);
        viewPager2 = view.findViewById(R.id.dotsviewPager);
        springDotsIndicator = view.findViewById(R.id.spring_dots_indicator);
        recyclerView = view.findViewById(R.id.recycleView);
        RCycleView = view.findViewById(R.id.recycleView2);

        API service = RClient.getRetrofitInstance().create(API.class);
        Call<ResMain> call = service.getData();
        call.enqueue(new Callback<ResMain>() {
            @Override
            public void onResponse(Call<ResMain> call, Response<ResMain> response) {
                ResMain resMain = response.body();
                generateDataList(resMain.getBackgroundImages());
                generateDataSlide(resMain.getData().get(0).getItems());
                generateTopPickData(resMain.getData().get(1).getItems());
                generateLatestData(resMain.getData().get(2).getItems());
            }

            @Override
            public void onFailure(Call<ResMain> call, Throwable t) {
                Toast.makeText(getContext(), "Something Went Wrong...", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }


    private void generateDataList(List<BackgroundImage> backgroundImages) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getContext(), backgroundImages);
        viewPager.setAdapter(viewPagerAdapter);
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == backgroundImages.size() - 1) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);
    }

    private void generateDataSlide(List<Item> items) {
        DotsViewPagerAdapter dotsViewPagerAdapter = new DotsViewPagerAdapter(getContext(), items);
        viewPager2.setAdapter(dotsViewPagerAdapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setPadding(100, 0, 100, 0);
        viewPager2.setPageMargin(24);
        springDotsIndicator.setViewPager(viewPager2);
    }

    private void generateTopPickData(List<Item> items) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter customAdapter = new CustomAdapter(getContext(), items);
        recyclerView.setAdapter(customAdapter);
    }

    private void generateLatestData(List<Item> items) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        RCycleView.setLayoutManager(linearLayoutManager);
        LatestAdapter latestAdapter = new LatestAdapter(getContext(), items);
        RCycleView.setAdapter(latestAdapter);
    }
}