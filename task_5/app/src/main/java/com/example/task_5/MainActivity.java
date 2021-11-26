package com.example.task_5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.task_5.Smiley.Head;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int param;
    Paint paint;
    Canvas canvas;
    Bitmap bitmap;
    LinearLayout linearLayout;
    float x, y;
    float[] pos;
    Button kind, neutral, evil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.Liner);
        paint = new Paint();
        bitmap = Bitmap.createBitmap(1080, 2000, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        //Default
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        param = 1;

        kind = findViewById(R.id.kind);
        kind.setOnClickListener(this);
        neutral = findViewById(R.id.neutral);
        neutral.setOnClickListener(this);
        evil = findViewById(R.id.evil);
        evil.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.kind:
                 param = 1;
                break;
            case R.id.neutral:
                param = 2;
                break;
            case R.id.evil:
                param = 3;
                break;
            default:
        }
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY()-230;

        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN: // нажатие
                bitmap.eraseColor(Color.TRANSPARENT);
                break;
            case MotionEvent.ACTION_MOVE: // движение
                break;
            case MotionEvent.ACTION_UP: // отпускание
                pos = new float[]{x, y};
                linearLayout.setBackground(new BitmapDrawable(bitmap));
                Head head = new Head();
                head.draw(paint, canvas, pos, param);


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
            case R.id.red:
                paint.setColor(Color.RED);
                break;
            case R.id.blue:
                paint.setColor(Color.BLUE);
                break;
            case R.id.green:
                paint.setColor(Color.GREEN);
                break;
            case R.id.yellow:
                paint.setColor(Color.YELLOW);
                break;
            default:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}