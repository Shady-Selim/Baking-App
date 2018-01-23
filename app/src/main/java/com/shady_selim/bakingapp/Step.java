package com.shady_selim.bakingapp;

import com.google.gson.annotations.Expose;

import org.parceler.Parcel;

/**
 * Created by Shady on 9/10/2017.
 */
@Parcel
class Step {
    @Expose
    public Integer id;
    @Expose
    public String shortDescription;
    @Expose
    public String description;
    @Expose
    public String videoURL;
    @Expose
    public String thumbnailURL;
}
