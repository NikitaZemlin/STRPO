package com.example.task_5.Smiley_parts;

import android.graphics.Canvas;
import android.graphics.Paint;


public class Eyes {
    public void draw(Paint paint, Canvas canvas, float[] pos, int param){
        float radius = 20;
        if (param==1){
            canvas.drawCircle(pos[0]-50, pos[1]-50, 10, paint);
            canvas.drawCircle(pos[0]+50, pos[1]-50, 10, paint);
        } else if (param==2){
;
        }else {

        }
    }
}
