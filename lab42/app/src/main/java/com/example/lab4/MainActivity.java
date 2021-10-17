package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button but;
    Paint paint;
    Canvas canvas;
    Bitmap bg;
    LinearLayout linearLayout;
    float x, y, xS, yS, xE, yE, d;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = findViewById(R.id.but);
        linearLayout = findViewById(R.id.Liner);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY();
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN: // нажатие
                xS = x;
                yS = y;
                break;
            case MotionEvent.ACTION_MOVE: // движение
                break;
            case MotionEvent.ACTION_UP: // отпускание
                yE = y;
                xE = x;
                d = (float) Math.sqrt(((xE-xS)*(xE-xS)) + ((yE-yS)*(yE-yS)));
                Toast.makeText(this, "Длина стрелки " + d, Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}