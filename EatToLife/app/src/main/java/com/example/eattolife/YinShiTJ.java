package com.example.eattolife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class YinShiTJ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yin_shi_tj);

        //获得图标
        TextView back1 = findViewById(R.id.back);
        Typeface font = Typeface.createFromAsset(getAssets(),"back.ttf");
        back1.setTypeface(font);

        //跳转按钮
        Button back2 = findViewById(R.id.back);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(YinShiTJ.this, Wo.class);
                startActivity(intent);
            }
        });
    }
}