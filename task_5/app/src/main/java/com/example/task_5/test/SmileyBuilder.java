package com.example.task_5.test;

import android.graphics.Canvas;
import android.graphics.Paint;

public class SmileyBuilder implements Builder {
    Paint paint;
    Canvas canvas;
    float[] pos;
    int param;
    @Override
    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    @Override
    public void setPos(float[] pos) {
        this.pos = pos;
    }

    @Override
    public void setParam(int param) {
        this.param = param;
    }

    public Smiley getResult(){
     return new Smiley(paint, canvas, pos, param);
    }
}
