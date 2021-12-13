package com.example.studygroupfind;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class ProfileActivity extends AppCompatActivity {

    public static final String TAG = "ProfileActivity";
    private Button btnUpdate;
    private EditText etUsername;
    private EditText etPassword;
    private EditText etMajor;
    private EditText etSchool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etMajor = findViewById(R.id.etMajor);
        etSchool = findViewById(R.id.etSchool);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnUpdate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick update button");
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                String school = etSchool.getText().toString();
                String major = etMajor.getText().toString();
                updateUser(username, password, school, major);
            }
        });
    }

    private void updateUser(String username, String password,String school, String major) {
        Log.i(TAG, "Attempting to update user" + username);
        ParseUser.logInInBackground(username, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (e != null) {
                    // TODO: better error handeling
                    Toast.makeText(ProfileActivity.this, "Issue with update!", Toast.LENGTH_SHORT).show();
                    Log.e(TAG,"Issue with Update", e);
                    return;
                }
                // TODO: navigate to the main activity if the user has signed in properly
                goMainActivity();
                Toast.makeText(ProfileActivity.this, "Success!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void goMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

}
