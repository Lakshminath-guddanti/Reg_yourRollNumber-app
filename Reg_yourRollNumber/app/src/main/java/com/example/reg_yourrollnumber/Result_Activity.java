package com.example.reg_yourrollnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result_Activity extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_);
        t = findViewById(R.id.txt);
        String roll_no =  getIntent().getStringExtra("roll_no");
        String name =  getIntent().getStringExtra("name");
        String email =  getIntent().getStringExtra("email");
        String phone =  getIntent().getStringExtra("phone");
        String password =  getIntent().getStringExtra("password");
        String gender =  getIntent().getStringExtra("gender");
        String branch =  getIntent().getStringExtra("branch");
        t.setText(
                "The Roll Number is:\n\t"+roll_no+"\nYour Name is:\n\t"+name+"\nYour Email is:\n\t"+email+"\nYour Phone Nuber is:\n\t"+phone+"\nThe Password You entered is:\n\t"+password+"\nYou are:"+gender+"\nYour Branch is:"+branch+"\n"
        );
    }
}