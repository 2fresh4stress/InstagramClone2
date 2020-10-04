package com.codepath.rkpandey.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Register your parse models
        ParseObject.registerSubclass (Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BLq2vPmZZ3VYbuL3hchW7ml5RRf4dHQ1zS0NBtvX")
                .clientKey("kYoyZolhWQ5c1BA6yN10piRDY0hBplpudGQOxsAl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
