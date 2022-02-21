package com.example.nawafalzahemmidterm22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
String namee;
String year;
String message;
int age;
int currrentyear=2022;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button act2_1=(Button)findViewById(R.id.act2btn1);
        Button act2_3=(Button)findViewById(R.id.act2btn3);
        EditText name=(EditText)findViewById(R.id.editTextTextPersonName);
        EditText birthYear=(EditText)findViewById(R.id.editTextNumberbirthyear);
        RadioButton male=(RadioButton)findViewById(R.id.male);
        RadioButton female=(RadioButton)findViewById(R.id.female);
        Button Submit=(Button)findViewById(R.id.submit);
        TextView Result=(TextView)findViewById(R.id.result);

        act2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
        act2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namee=name.getText().toString();
                if(namee.length()>0){
                    year=birthYear.getText().toString();
                    if(year.length()>0){
                        age=Integer.parseInt(year);
                        if(age>1900 && age<=2022){
                            age=currrentyear-age;
                            if(male.isChecked()){
                                Result.setText("hi MR. "+namee+" you are "+age+" years old");
                            }
                            else if(female.isChecked()){
                                Result.setText("hi MiSS. "+namee+" you are "+age+" years old");
                            }
                            else{
                                Toast.makeText(MainActivity2.this,"please insert right gender",Toast.LENGTH_LONG).show();
                            }
                        }
                        else{
                            Toast.makeText(MainActivity2.this,"please insert right birthyear",Toast.LENGTH_LONG).show();
                        }
                    }
                    else{
                        Toast.makeText(MainActivity2.this,"please insert your birthyear",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity2.this,"please insert your name",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}