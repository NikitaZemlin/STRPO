package com.example.task_7.Observer.Observers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.Toast;

import com.example.task_7.Observer.Observer;

public class timeObserver implements Observer {
    @Override
    public void handleEvent(Paint paint, Canvas canvas, Context context, int time) {
        Toast.makeText(context, "Прошло 10 секунд, пора менять цвет", Toast.LENGTH_SHORT).show();
        paint.setColor(Color.YELLOW);

        canvas.drawRect(300, 500,800, 1800,  paint);
    }

}
