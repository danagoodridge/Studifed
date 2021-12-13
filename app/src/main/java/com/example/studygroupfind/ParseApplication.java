package com.example.studygroupfind;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {


    @Override
    public void onCreate(){
        super.onCreate();
        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("I5VMq8IAa9K9sObcVPGhbS9gq1Lc3womms0yyIRz")
                .clientKey("fOdRufSE7TsAAbX7c1pCbaJuc1r2kTxRqtY07D4a")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
