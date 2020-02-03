package com.example.kea_week6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class page3 extends AppCompatActivity implements View.OnClickListener {

    Button button_front, button_page5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);


        button_front = findViewById(R.id.but_front1);
        button_front.setOnClickListener(this);
        button_page5 = findViewById(R.id.but_page5);
        button_page5.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.but_front1:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.but_page5:
                Intent intent1 = new Intent(this, page2.class);
                startActivity(intent1);
                break;
        }
    }
}
