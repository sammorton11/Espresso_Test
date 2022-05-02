package com.example.test01

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.time.temporal.TemporalAdjusters.next

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @get:Rule var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkActivityVisibility1(){
        onView(withId(R.id.firstLayout))
            .check(matches(isDisplayed()))
    }

    @Test
    fun checkingTextVisibility1(){
        onView(withId(R.id.textView1))
            .check(matches(isDisplayed()))
    }

    @Test
    fun checkingButtonNextVisibility() {
        onView(withId(R.id.buttonNext))
            .check(matches(isDisplayed()))
    }

    @Test
    fun checkIfTextIsFirst(){
        onView(withId(R.id.textView1))
            .check(matches(withText(R.string.first)))
    }

    @Test
    fun checkIfTextIsNext(){
        onView(withId(R.id.buttonNext))
            .check(matches(withText(R.string.next)))
    }

    @Test
    fun checkButtonFunctionality(){
        onView(withId(R.id.buttonNext))
            .perform(click())

        onView(withId(R.id.secondLayout))
            .check(matches(isDisplayed()))

        onView(withId(R.id.buttonBack))
            .perform(click())

        onView(withId(R.id.firstLayout))
            .check(matches(isDisplayed()))
    }

}