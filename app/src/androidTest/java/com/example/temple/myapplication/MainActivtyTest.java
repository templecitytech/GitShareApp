package com.example.temple.myapplication;


import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;


import static android.support.test.espresso.Espresso.onView;


public class MainActivtyTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private static final String TEST_CASE = "Hello World";

    public MainActivtyTest() {
        super(MainActivity.class);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testTheString() {
        onView(ViewMatchers.withId(R.id.tv_hello)).perform(ViewActions.click());
        onView(ViewMatchers.withId(R.id.tv_hello)).check(ViewAssertions.matches(ViewMatchers.withText(TEST_CASE)));
    }


}
