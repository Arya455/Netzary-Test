package com.files.netzarytest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("icon")
    @Expose
    private Integer icon;
    @SerializedName("two_line")
    @Expose
    private Boolean twoLine;
    @SerializedName("see_all")
    @Expose
    private String seeAll;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public Boolean getTwoLine() {
        return twoLine;
    }

    public void setTwoLine(Boolean twoLine) {
        this.twoLine = twoLine;
    }

    public String getSeeAll() {
        return seeAll;
    }

    public void setSeeAll(String seeAll) {
        this.seeAll = seeAll;
    }

}