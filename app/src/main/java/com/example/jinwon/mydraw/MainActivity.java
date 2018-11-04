package com.example.jinwon.mydraw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private SingleTouchView drawView;
    private ImageButton currPaint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("[MP01]05_201402406_이진원");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawView = (SingleTouchView)findViewById(R.id.drawing);
        LinearLayout paintLayout = (LinearLayout)findViewById(R.id.paint_colors);
        currPaint = (ImageButton)paintLayout.getChildAt(0);
    }

    public void clicked(View view){
        if(view != currPaint){
            String color = view.getTag().toString();
            drawView.setColor(color);
            currPaint = (ImageButton)view;
        }
    }
}
