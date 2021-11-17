package com.example.lab4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.lab4.arrows.ArrowAssociation;
import com.example.lab4.arrows.ArrowComposition;
import com.example.lab4.arrows.ArrowInheritance;

public class MainActivity extends AppCompatActivity {
    Button but;
    Paint paint;
    Canvas canvas;
    Bitmap bitmap;
    int c=0;
    LinearLayout linearLayout;
    float x, y, xS, yS, xE, yE, d;
    float[] pos;
    DisplayMetrics displayMetrics;
    int height, width;
    String arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = findViewById(R.id.but);

        displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        height = displayMetrics.heightPixels;
        width = displayMetrics.widthPixels;

        linearLayout = findViewById(R.id.Liner);
        paint = new Paint();
        bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);


        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c==0){
                    twoCircle one = new twoCircle();
                    one.draw(paint, canvas);
                    twoCircle two = new twoCircle();
                    two.draw(paint, canvas);
                    c+=1;
                } else{
                    bitmap.eraseColor(Color.TRANSPARENT);
                    c=0;
                }
            }
        });

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY()-230;

        label:
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN: // нажатие
                xS = x;
                yS = y;
                break;
            case MotionEvent.ACTION_MOVE: // движение
                break;
            case MotionEvent.ACTION_UP: // отпускание

                yE = y;
                xE = x;
                pos = new float[]{xS, yS, xE, yE};
                linearLayout.setBackground(new BitmapDrawable(bitmap));
                switch (arrow) {
                    case "Association":
                        ArrowAssociation arrowAssociation = new ArrowAssociation();
                        arrowAssociation.draw(paint, canvas, pos);
                        break;
                    case "Inheritance":
                        ArrowInheritance arrowInheritance = new ArrowInheritance();
                        arrowInheritance.draw(paint, canvas, pos);
                        break;
                    case "Implementation":

                        break;
                    case "Addiction":

                        break;
                    case "Aggregation":

                        break;
                    case "Composition":
                        ArrowComposition arrowComposition = new ArrowComposition();
                        arrowComposition.draw(paint, canvas, pos);
                        break;
                }


        }
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_Association:
                //Ассоциация
                arrow = "Association";
                break;

            case R.id.action_Inheritance:
                //Наследование
                arrow = "Inheritance";
                break;

            case R.id.action_Implementation:
                //Реализация
                arrow = "Implementation";
                break;

            case R.id.action_Addiction:
                //Зависимость
                arrow = "Addiction";
                break;

            case R.id.action_Aggregation:
                //Агрегация
                arrow = "Aggregation";
                break;

            case R.id.action_Composition:
                //Композиция
                arrow = "Composition";
                break;

            default:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}