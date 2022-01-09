package com.safaiqtifan.myage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buGetAge(View view) {

        EditText birth = findViewById(R.id.etAge);
        int yearOfBirth = Integer.parseInt(birth.getText().toString());
        int age =2020-yearOfBirth;

        TextView t = findViewById(R.id.textView);
        t.setText(age);

    }
}