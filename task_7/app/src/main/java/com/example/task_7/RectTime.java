package com.example.task_7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.example.task_7.Observer.Observed;
import com.example.task_7.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class RectTime implements Observed {
    Paint paint;
    Canvas canvas;
    Context context;
    int time;
    List<Observer> observers = new ArrayList<>();


    public void setRectTime(Paint paint, Canvas canvas, Context context, int time){
        this.paint = paint;
        this.canvas = canvas;
        this.context = context;
        this.time = time;
        notifyObserver();
    }


    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o: observers){
            o.handleEvent(paint, canvas, context, time);
        }
    }

}
