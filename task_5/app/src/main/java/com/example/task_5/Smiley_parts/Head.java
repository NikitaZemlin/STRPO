package com.example.task_5.Smiley_parts;


import android.graphics.Canvas;
import android.graphics.Paint;



public class Head {
    public void draw(Paint paint, Canvas canvas, float[] pos, int param){
        if (param==1){
            canvas.drawCircle(pos[0],pos[1], 150,  paint);
        } else if (param==2){
            canvas.drawRect(pos[0]-130, pos[1]-150, pos[0]+130, pos[1]+150,  paint);
        }else {
            canvas.drawRoundRect(pos[0]-130, pos[1]-150, pos[0]+130, pos[1]+150, 40, 40,  paint);
        }
    }
}
