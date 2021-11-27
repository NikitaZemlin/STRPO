package com.example.task_5.Smiley_parts;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;


public class Month {
    public void draw(Paint paint, Canvas canvas, float[] pos, int param){
        float radius = 20;
        if (param==1){
            RectF month = new RectF();
            month.set(pos[0] - radius-30,
                    pos[1] - radius-30,
                    pos[0] + radius+30,
                    pos[1] + radius+30);
            canvas.drawArc(month, 360, 180, false, paint);
        } else if (param==2){
            canvas.drawLine(pos[0]-100, pos[1]+80, pos[0]+100, pos[1]+80, paint);
        }else {
            canvas.drawLine(pos[0]-100, pos[1]+80, pos[0]+100, pos[1]+80, paint);
            Path path_r = new Path();
            path_r.moveTo(pos[0]+100, pos[1]+80);
            path_r.lineTo(pos[0]+80, pos[1]+100);
            path_r.lineTo(pos[0]+60, pos[1]+80);
            path_r.lineTo(pos[0]+100, pos[1]+80);
            path_r.close();
            canvas.drawPath(path_r, paint);

            Path path_l = new Path();
            path_l.moveTo(pos[0]-100, pos[1]+80);
            path_l.lineTo(pos[0]-80, pos[1]+100);
            path_l.lineTo(pos[0]-60, pos[1]+80);
            path_l.lineTo(pos[0]-100, pos[1]+80);
            path_l.close();
            canvas.drawPath(path_l, paint);
        }
    }
}
