package com.example.test01

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest{

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(SecondActivity::class.java)

    @Test
    fun checkActivityVisibility2(){
        onView(withId(R.id.secondLayout))
            .check(matches(isDisplayed()))
    }

    @Test
    fun checkingTextVisibility2(){
        onView(withId(R.id.textView2))
            .check(matches(isDisplayed()))
    }

    @Test
    fun checkingButtonBackVisibility(){
        onView(withId(R.id.buttonBack))
            .check(matches(isDisplayed()))
    }

    @Test
    fun checkButtonBack(){
        onView(withId(R.id.secondLayout))
            .check(matches(isDisplayed()))

        onView(withId(R.id.buttonBack))
            .perform(click())

    }
}