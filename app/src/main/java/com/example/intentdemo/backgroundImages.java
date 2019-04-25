package com.example.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class backgroundImages extends AppCompatActivity {

    ImageView waterfall;
    ImageView moon;
    int imgVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_images);
        waterfall = (ImageView) findViewById(R.id.moonImgView);
        moon = (ImageView) findViewById(R.id.waterImgView);

        waterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgVal = R.id.waterImgView;
                finish();
            }
        });

        moon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgVal = R.id.moonImgView;
            }
        });



    }
    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("imageVal", imgVal);
        setResult(RESULT_OK, intent);
        super.finish();

    }
}
