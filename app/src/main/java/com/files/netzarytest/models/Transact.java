package com.files.netzarytest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Transact {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("label_seller")
    @Expose
    private String labelSeller;
    @SerializedName("label_buyer")
    @Expose
    private String labelBuyer;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("price_unit")
    @Expose
    private Object priceUnit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getLabelSeller() {
        return labelSeller;
    }

    public void setLabelSeller(String labelSeller) {
        this.labelSeller = labelSeller;
    }

    public String getLabelBuyer() {
        return labelBuyer;
    }

    public void setLabelBuyer(String labelBuyer) {
        this.labelBuyer = labelBuyer;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Object getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Object priceUnit) {
        this.priceUnit = priceUnit;
    }
}