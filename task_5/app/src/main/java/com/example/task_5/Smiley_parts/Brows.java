package com.example.task_5.Smiley_parts;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;


public class Brows {
    public void draw(Paint paint, Canvas canvas, float[] pos, int param){
        float radius = 20;
        if (param==1){
            RectF brow_1 = new RectF();
            brow_1.set(pos[0] - radius-50,
                    pos[1] - radius-100,
                    pos[0] + radius-50,
                    pos[1] + radius-100);
            canvas.drawArc(brow_1, 360, 180, false, paint);
            RectF brow_2 = new RectF();
            brow_2.set(pos[0] - radius+50,
                    pos[1] - radius-100,
                    pos[0] + radius+50,
                    pos[1] + radius-100);
            canvas.drawArc(brow_2, 360, 180, false, paint);
        } else if (param==2){
            canvas.drawLine(pos[0]-100, pos[1]-100, pos[0]-40, pos[1]-100, paint);
            canvas.drawLine(pos[0]+100, pos[1]-100, pos[0]+40, pos[1]-100, paint);
        }else {
            canvas.drawLine(pos[0]-100, pos[1]-100, pos[0]-20, pos[1]-70, paint);
            canvas.drawLine(pos[0]+100, pos[1]-100, pos[0]+20, pos[1]-70, paint);
        }
    }
}
