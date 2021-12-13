package com.example.studygroupfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private ImageView ivViewProfile;
    private ImageView ivViewStudyGroup;
    private ImageView ivFriendSearch;
    private ImageView ivViewFriends;
    private ImageView ivSearchStudyGroup;
    private ImageView ivChat;

    // TODO: Add Logout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivViewProfile = findViewById(R.id.ivViewProfile);
        ivViewStudyGroup = findViewById(R.id.ivViewStudyGroup);
        ivFriendSearch = findViewById(R.id.ivFriendSearch);
        ivViewFriends = findViewById(R.id.ivViewFriends);
        ivSearchStudyGroup = findViewById(R.id.ivSearchStudyGroup);
        ivChat = findViewById(R.id.ivChat);


        ivChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick chat");
                Intent i = new Intent(MainActivity.this, ChatActivity.class);
                startActivity(i);
                finish();
            }
        });

        ivViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick Profile");
                Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(i);
                finish();
            }

        });



    }



}
