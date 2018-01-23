package com.shady_selim.bakingapp;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by Shady on 9/10/2017.
 */

public class Recipes {
    @Expose
    public Integer id;
    @Expose
    public String name;
    @Expose
    public List<Ingredient> ingredients = null;
    @Expose
    public List<Step> steps = null;
    @Expose
    public Integer servings;
    @Expose
    public String image;
}
