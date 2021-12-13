package com.example.studygroupfind;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class RegisterActivity extends AppCompatActivity {

        public static final String TAG = "RegisterActivity";
        private EditText etUsername;
        private EditText etPassword;
        private EditText etName;
        private EditText etSchool;
        private EditText etMajor;
        private EditText etClassification;
        private Button btnRegister;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_register);

                if (ParseUser.getCurrentUser() != null) {
                        goLoginActivity();
                }

                etUsername = findViewById(R.id.etUsername);
                etPassword = findViewById(R.id.etPassword);
                etName = findViewById(R.id.etName);
                etSchool = findViewById(R.id.etSchool);
                etMajor = findViewById(R.id.etMajor);
                etClassification = findViewById(R.id.etClassification);
                btnRegister = findViewById(R.id.btnRegister);
                btnRegister.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Log.i(TAG, "onClick register button");
                                String username = etUsername.getText().toString();
                                String password = etPassword.getText().toString();
                                String name = etName.getText().toString();
                                String school = etSchool.getText().toString();
                                String major = etMajor.getText().toString();
                                String classification = etClassification.getText().toString();
                                register(username, password, name, school, major, classification);
                        }
                });

        }

        private void register(String username, String password, String name, String school, String major, String classification) {
        }

        private void goLoginActivity() {
                Intent i = new Intent(this, LoginActivity.class);
                startActivity(i);
                finish();
        }
}
