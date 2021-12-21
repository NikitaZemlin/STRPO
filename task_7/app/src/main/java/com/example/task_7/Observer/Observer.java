package com.example.task_7.Observer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

public interface Observer {
    void handleEvent(Paint paint, Canvas canvas, Context context, int time);
}
