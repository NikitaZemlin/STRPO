package com.example.lab4;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

public class twoCircle {


    public void draw(Paint paint, Canvas canvas) {
        Random r = new Random();
        int low = 980;
        int high = 2086;
        int x = r.nextInt(high-low);
        int y = r.nextInt(high-low);

        paint.setColor(Color.GREEN);
        canvas.drawCircle(x,y, 80,  paint);
    }

}
