package com.example.kea_week6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button_page2;
    Button button_page3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_page2 = findViewById(R.id.but_page2);
        button_page2.setOnClickListener(this);

        button_page3 = findViewById(R.id.but_page3);
        button_page3.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.but_page2:
                Intent intent = new Intent(this, page2.class);
                startActivity(intent);
                break;

            case R.id.but_page3:
                Intent intent1 = new Intent(this, page3.class);
                startActivity(intent1);
                break;
        }
    }
}
