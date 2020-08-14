package com.example.app_java;

import android.app.Activity;
import android.os.Bundle;

// importing Color Package
import android.graphics.Color;

// for designing the interface
// use the certain layout so that the elements are place properly
// importing layout
import android.widget.RelativeLayout;

// importing button
import android.widget.Button;
import android.widget.EditText;

import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // using the RelativeLayout and Button under "onCreate" method
        // creating object of RelativeLayout with name of "myLayout" ________ (Object Initialization)
        RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton = new Button(this);        // adding to the activity, we need to specify the object

        // setting the background color
        myLayout.setBackgroundColor(Color.BLUE);
        myButton.setBackgroundColor(Color.GREEN);

        // setting to the button
        myButton.setText("Sign_In");

        // alignment of button
        // "buttonDetails" widget (object)
        RelativeLayout.LayoutParams buttonDetails =
               new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        // adding rule for "buttonDetails"
        // setting the position
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        // "addView" adds the element to the layout
        myLayout.addView(myButton, buttonDetails);

        // creating object of edit text
        EditText username = new EditText(this);
        username.setTextColor(Color.WHITE);

        // setting "id" which will be specific for widgets or elements
        myButton.setId(1);
        username.setId(2);

        // alignment of username
        // "usernameDetails" widget (object)
        RelativeLayout.LayoutParams usernameDetails =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        // adding rule for "usernameDetails"
        // setting the position
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.addRule(RelativeLayout.ABOVE, myButton.getId());

        // DIP(Density Independent Pixels) for setting width
        // creating resource object with name "r", use in order to get the resources which are associated with the device
        // "getResources()", method is use in order to get the resources which are associated the device
        Resources r = getResources();

        // converting the DIP to Pixels, using "TypeValue.appliedDimension" methods
        // which accepts 3 params:
        // 1: consisting of the unit which we are going to translate
        // 2: the no. of units which we want to translate
        // 3: DisplayMatrics
        // methods "getDisplayMatrics", to get the display which will be calculating those 3 params to convert
        // "(int)" is the type casting, in order to translate the value into integer
        int px = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 320, r.getDisplayMetrics());

        // Setting the width of EditText "username"
        username.setWidth(px);

        // adding margin
        usernameDetails.setMargins(0,0,0,50);
        myLayout.addView(username, usernameDetails);

        // setting the content view to the new layout "myLayout"
        setContentView(myLayout);

    }
}