package com.tekgs.practiceRWP.view.landing;

public class LandingView {

    // your test view of the landing page

    //fields
        //description
        //relative uri - "landing"
        //domain uri unless your project has an abstract class extending UiView - http://localhost:3000
        //locator type for this whole view/page - ID
        // locator value for this whole view/page  - the id="____"

    //constructor
        // must be public in order for this pg to be able to be made in the browser
        // super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI), UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
            // in order for you to make this web page, here is DOMAIN_URI/RELATIVE_URI which translates to http://localhost:3000/landing
            // for this web page I need a locatorType(id) and locatorValue(landing-page)

    //directNav
        // new (this class's name) .load <--- You are asking chrome to load a webpage with all the information provided in this class
        //return a UiView I expect everything in this class to render

    //
}
