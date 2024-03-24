package com.example.assignmet1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Screen extends AppCompatActivity {
    ImageButton backButton;
    Button one,two,three;
    TextView line1,line2,line3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);
        backButton = findViewById(R.id.bb);
        one  = findViewById(R.id.b1);
        two = findViewById(R.id.b2);
        three= findViewById(R.id.b3);
        line1= findViewById(R.id.t1);
        line2= findViewById(R.id.t2);
        line3= findViewById(R.id.t3);
        backButton.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                }
        );

        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                line1.setVisibility(View.VISIBLE);
                line2.setVisibility(View.INVISIBLE);
                line3.setVisibility(View.INVISIBLE);
            }
        });

        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                line2.setVisibility(View.VISIBLE);
                line1.setVisibility(View.INVISIBLE);
                line3.setVisibility(View.INVISIBLE);
                setContentView(R.layout.insta_screen);
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                line3.setVisibility(View.VISIBLE);
                line2.setVisibility(View.INVISIBLE);
                line1.setVisibility(View.INVISIBLE);
            }
        });
    }
}
