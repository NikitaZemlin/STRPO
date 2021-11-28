package com.example.task_5.test;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.example.task_5.Smiley_parts.Brows;

public interface Builder {
    void setCanvas(Canvas canvas);
    void setPaint(Paint paint);
    void setPos(float[] pos);
    void setParam(int param);
}
