package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView logo1 = (TextView) findViewById(R.id.logo_top);
        TextView logo2 = (TextView) findViewById(R.id.TextViewBottomTitle);
        TextView logo3 = (TextView) findViewById(R.id.TextViewBottomVersion);

        ImageView image1 = (ImageView) findViewById(R.id.ImageView2_Left);
        ImageView image4 = (ImageView) findViewById(R.id.ImageView3_Right);
        Animation custom1 = AnimationUtils.loadAnimation(this, R.anim.custom_anim);
        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        logo1.startAnimation(fade1);
        logo2.startAnimation(fade1);
        logo3.startAnimation(fade1);
        image1.startAnimation(custom1);
        image4.startAnimation(custom1);
    }
}