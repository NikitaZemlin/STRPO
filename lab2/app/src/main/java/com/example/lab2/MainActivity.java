package com.example.lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    Paint paint;
    Bitmap bg;
    Canvas canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.draw_area);
        paint = new Paint();
        bg = Bitmap.createBitmap(480, 800, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bg);
        linearLayout.setBackground(new BitmapDrawable(bg));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.btn_circle:
                Circle circle = new Circle("#ffd000", (float) 54.3);
                circle.draw(paint, canvas);
                Toast.makeText(getApplicationContext(), circle.name(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btn_ellipse:
                float left, top, right, bottom;
                left = 342;
                top = 423;
                right = 100;
                bottom = 100;
                Ellipse ellipse = new Ellipse("#00ff00", left, top, left+right, top+bottom);
                ellipse.draw(paint, canvas);
                Toast.makeText(getApplicationContext(), ellipse.name(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btn_rect:
                Rect rect = new Rect("#ff0000", 90.323F, 240);
                rect.draw(paint, canvas);
                Toast.makeText(getApplicationContext(), rect.name(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btn_roundedRect:
                RoundenRect roundenRect = new RoundenRect("#a6ffff", (float) 185.4, 300);
                roundenRect.draw(paint, canvas);
                Toast.makeText(getApplicationContext(), roundenRect.name(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btn_square:
                Square square = new Square("#ffffff",150);
                square.draw(paint, canvas);
                Toast.makeText(getApplicationContext(), square.name(), Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
