package com.example.task_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.task_7.Observer.Observed;
import com.example.task_7.Observer.Observer;
import com.example.task_7.Observer.Observers.paramObserver;
import com.example.task_7.Observer.Observers.timeObserver;

import java.util.Locale;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    Paint paint;
    Canvas canvas;
    Bitmap bitmap;
    LinearLayout linearLayout;
    Context context;
    int time = 10;
    RectTime rectTime;
    int seconds = 0;
    boolean running = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;


        linearLayout = findViewById(R.id.Liner);
        paint = new Paint();
        bitmap = Bitmap.createBitmap(1080, 2200, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        linearLayout.setBackground(new BitmapDrawable(bitmap));
        rectTime = new RectTime();
        rectTime.addObserver(new paramObserver());
        rectTime.setRectTime(paint, canvas, context, seconds);



        timer();
    }


    public void timer()	{

        final Handler handler
                = new Handler();
        handler.post(new Runnable() {
            @Override

            public void run()
            {
                int secs = seconds % 60;
                System.out.println(secs);
                if (running) {
                    seconds++;
                    if (time==seconds){
                        paint = new Paint();
                        bitmap = Bitmap.createBitmap(1080, 2200, Bitmap.Config.ARGB_8888);
                        canvas = new Canvas(bitmap);
                        linearLayout.setBackground(new BitmapDrawable(bitmap));
                        rectTime.addObserver(new timeObserver());
                        rectTime.setRectTime(paint, canvas, context, seconds);
                    }
                }
                handler.postDelayed(this, 1000);
            }
        });
    }
}
