package com.example.reg_yourrollnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText eroll,ename,eemail,epass,ephone;
RadioButton r1,r2;
Spinner bspin;
String sroll,sname,semail,sphone,spass,sr,sbranch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eroll = findViewById(R.id.rollno);
        ename = findViewById(R.id.name);
        eemail = findViewById(R.id.email);
        ephone = findViewById(R.id.phoneno);
        epass = findViewById(R.id.password);
        r1 = findViewById(R.id.genmale);
        r2  =findViewById(R.id.genfemale);
        bspin = findViewById(R.id.branchspiner);
    }

    public void onSubmit(View view) {
        sroll = eroll.getText().toString();
        sname = ename.getText().toString();
        semail = eemail.getText().toString();
        sphone = ephone.getText().toString();
        spass = epass.getText().toString();
        if(r1.isChecked()) {
            sr = r1.getText().toString();
        }
        else{
            sr = r2.getText().toString();
        }
        sbranch = bspin.getSelectedItem().toString();
        if((sroll.matches("")) && (sname.matches("")) && (semail.matches("")) && (sphone.matches("")) && (spass.matches(""))){
            Toast.makeText(this, "All Fields are required", Toast.LENGTH_SHORT).show();
        }else if(sbranch.matches("Select your branch")){
            Toast.makeText(this, "Select your Branch", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i = new Intent(MainActivity.this,Result_Activity.class );
            i.putExtra("roll_no",sroll);
            i.putExtra("name",sname);
            i.putExtra("email",semail);
            i.putExtra("phone",sphone);
            i.putExtra("password",spass);
            i.putExtra("gender",sr);
            i.putExtra("branch",sbranch);
            startActivity(i);

        }
    }
}