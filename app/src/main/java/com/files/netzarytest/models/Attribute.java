package com.files.netzarytest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attribute {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("key_id")
    @Expose
    private Integer keyId;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("required")
    @Expose
    private Boolean required;
    @SerializedName("ordering")
    @Expose
    private Integer ordering;
    @SerializedName("unit")
    @Expose
    private String unit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


}