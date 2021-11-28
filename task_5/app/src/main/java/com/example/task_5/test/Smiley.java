package com.example.task_5.test;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Smiley {
    Paint paint;
    Canvas canvas;
    float[] pos;
    int param;

    public Smiley(Paint paint, Canvas canvas, float[] pos, int param) {
        this.paint = paint;
        this.canvas = canvas;
        this.pos = pos;
        this.param = param;
    }

    public Paint getPaint() {
        return paint;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public float[] getPos() {
        return pos;
    }

    public int getParam() {
        return param;
    }
}
