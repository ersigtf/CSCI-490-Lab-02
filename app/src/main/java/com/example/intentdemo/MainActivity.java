package com.example.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    public static final int CODE = 12;
    private Button setBackgroundBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBackgroundBtn = (Button)findViewById(R.id.setBackgroundBtn);
        setBackgroundBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backgroundImages = new Intent(getApplicationContext(), backgroundImages.class);
                startActivityForResult(backgroundImages, CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CODE && resultCode == Activity.RESULT_OK){
            Bundle storage = data.getExtras();
            if (storage != null) {
                int imgVal = storage.getInt("imageVal");
                ConstraintLayout layout = findViewById(R.id.mainLayout);
                layout.setBackground(getDrawable(imgVal));

            }

        }


    }
}
