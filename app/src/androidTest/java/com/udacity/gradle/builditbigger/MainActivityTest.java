package com.udacity.gradle.builditbigger;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.example.android.jokedisplay.JokeDisplayActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    private static String staticTestJoke = "What kind of music are balloons afraid of? Pop music.";

    @Rule
    public IntentsTestRule<MainActivity> mMainActivityTestRule =
            new IntentsTestRule<>(MainActivity.class);

    @Test
    public void clickOnTellJokeButton_showLoadedJoke() throws Exception {

        //By clicking on "Tell Joke" button we start the AsyncTask which opens the JokeDisplayActivity
        //and pass the joke into it as an intent EXTRA.
        onView(withId(R.id.btn_tell_joke)).perform(click());

        //The appropriate intent starts with the downloaded joke.
        intended(
                allOf(hasComponent(JokeDisplayActivity.class.getCanonicalName()),
                        hasExtra(JokeDisplayActivity.EXTRA_DATA, staticTestJoke)
                )
        );
    }
}