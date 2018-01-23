package com.shady_selim.bakingapp;

import com.google.gson.annotations.Expose;

import org.parceler.Parcel;

/**
 * Created by Shady on 9/10/2017.
 */
@Parcel
class Ingredient {
    @Expose
    public String quantity;
    @Expose
    public String measure;
    @Expose
    public String ingredient;
}
