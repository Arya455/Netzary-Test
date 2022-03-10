package com.files.netzarytest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResMain {
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("transacts")
    @Expose
    private List<Transact__1> transacts = null;
    @SerializedName("background_images")
    @Expose
    private List<BackgroundImage> backgroundImages = null;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public List<Transact__1> getTransacts() {
        return transacts;
    }

    public void setTransacts(List<Transact__1> transacts) {
        this.transacts = transacts;
    }

    public List<BackgroundImage> getBackgroundImages() {
        return backgroundImages;
    }

    public void setBackgroundImages(List<BackgroundImage> backgroundImages) {
        this.backgroundImages = backgroundImages;
    }

}

