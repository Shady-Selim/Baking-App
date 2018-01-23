package com.shady_selim.bakingapp;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Shady on 9/16/2017.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void FromMainTillStep() {
        onView(withId(R.id.recipes)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.recipestepdescription_list)).check(matches(isDisplayed()));
        onView(withId(R.id.recipestepdescription_list)).perform(RecyclerViewActions.actionOnItemAtPosition(2, click()));
        onView(withId(R.id.recipestepdescription_detail)).check(matches(isDisplayed()));
    }
    @Test
    public void FromMainTillIngredient() {
        onView(withId(R.id.recipes)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.recipestepdescription_list)).check(matches(isDisplayed()));
        onView(withId(R.id.recipestepdescription_list)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.recipestepdescriptionDetails_list)).check(matches(isDisplayed()));
    }

}
