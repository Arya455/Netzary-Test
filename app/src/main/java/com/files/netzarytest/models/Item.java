package com.files.netzarytest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("min_price")
    @Expose
    private double minPrice;
    @SerializedName("price")
    @Expose
    private double price;
    @SerializedName("listing_id")
    @Expose
    private String listingId;
    @SerializedName("created_since")
    @Expose
    private String createdSince;
    @SerializedName("updated_since")
    @Expose
    private String updatedSince;
    @SerializedName("category")
    @Expose
    private Category__1 category;
    @SerializedName("category_slug")
    @Expose
    private String categorySlug;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = null;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("is_spam")
    @Expose
    private Boolean isSpam;
    @SerializedName("is_premium")
    @Expose
    private Boolean isPremium;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;
    @SerializedName("expiry_date")
    @Expose
    private String expiryDate;
    @SerializedName("offer")
    @Expose
    private Object offer;
    @SerializedName("is_chat_allowed")
    @Expose
    private Boolean isChatAllowed;
    @SerializedName("is_offensive")
    @Expose
    private Boolean isOffensive;
    @SerializedName("is_auction")
    @Expose
    private Boolean isAuction;
    @SerializedName("out_kashmir")
    @Expose
    private Boolean outKashmir;
    @SerializedName("viewers")
    @Expose
    private Integer viewers;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("posted")
    @Expose
    private Long posted;
    @SerializedName("transact")
    @Expose
    private Transact transact;
    @SerializedName("in_wishlist")
    @Expose
    private Boolean inWishlist;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getCreatedSince() {
        return createdSince;
    }

    public void setCreatedSince(String createdSince) {
        this.createdSince = createdSince;
    }

    public String getUpdatedSince() {
        return updatedSince;
    }

    public void setUpdatedSince(String updatedSince) {
        this.updatedSince = updatedSince;
    }

    public Category__1 getCategory() {
        return category;
    }

    public void setCategory(Category__1 category) {
        this.category = category;
    }

    public String getCategorySlug() {
        return categorySlug;
    }

    public void setCategorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Boolean getIsSpam() {
        return isSpam;
    }

    public void setIsSpam(Boolean isSpam) {
        this.isSpam = isSpam;
    }

    public Boolean getIsPremium() {
        return isPremium;
    }

    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Object getOffer() {
        return offer;
    }

    public void setOffer(Object offer) {
        this.offer = offer;
    }

    public Boolean getIsChatAllowed() {
        return isChatAllowed;
    }

    public void setIsChatAllowed(Boolean isChatAllowed) {
        this.isChatAllowed = isChatAllowed;
    }

    public Boolean getIsOffensive() {
        return isOffensive;
    }

    public void setIsOffensive(Boolean isOffensive) {
        this.isOffensive = isOffensive;
    }

    public Boolean getIsAuction() {
        return isAuction;
    }

    public void setIsAuction(Boolean isAuction) {
        this.isAuction = isAuction;
    }

    public Boolean getOutKashmir() {
        return outKashmir;
    }

    public void setOutKashmir(Boolean outKashmir) {
        this.outKashmir = outKashmir;
    }

    public Integer getViewers() {
        return viewers;
    }

    public void setViewers(Integer viewers) {
        this.viewers = viewers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPosted() {
        return posted;
    }

    public void setPosted(Long posted) {
        this.posted = posted;
    }

    public Transact getTransact() {
        return transact;
    }

    public void setTransact(Transact transact) {
        this.transact = transact;
    }

    public Boolean getInWishlist() {
        return inWishlist;
    }

    public void setInWishlist(Boolean inWishlist) {
        this.inWishlist = inWishlist;
    }


}