package com.example.lab2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }
    public abstract String name();
    abstract double area();
    abstract void draw(Paint paint, Canvas canvas);

}
