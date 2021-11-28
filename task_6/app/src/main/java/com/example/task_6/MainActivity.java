package com.example.task_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.task_6.Sorts.bubbleSort;
import com.example.task_6.Sorts.choiceSort;
import com.example.task_6.Sorts.insertSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bubble, insert, choice, newArray;
    TextView lastArr, firstArr;
    int[] arr = new int[100];
    int[] sortArr;// = new int[100];
    Strategy strategy;


    Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = new Random();
        firstArr = findViewById(R.id.firstArr);
        lastArr = findViewById(R.id.lastArr);




        bubble = findViewById(R.id.bubble);
        bubble.setOnClickListener(this);
        insert = findViewById(R.id.insert);
        insert.setOnClickListener(this);
        choice = findViewById(R.id.choice);
        choice.setOnClickListener(this);
        newArray = findViewById(R.id.newArray);
        newArray.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bubble:
                Context contextBubble = new Context(new bubbleSort());
                contextBubble.sortArr(arr);
                sortArr = contextBubble.getArr();
                sortArr = Arrays.copyOf(arr, arr.length);
                StringBuilder builderBubble = new StringBuilder();
                for (int i=0; i<sortArr.length; i++) {
                    builderBubble.append(Integer.toString(sortArr[i]));
                    builderBubble.append("  ");
                }
                String StringBubble = builderBubble.toString();
                lastArr.setText(StringBubble);
                break;
            case R.id.insert:
                Context contextInsert = new Context(new insertSort());
                contextInsert.sortArr(arr);
                sortArr = contextInsert.getArr();
                sortArr = Arrays.copyOf(arr, arr.length);
                StringBuilder builderInsert = new StringBuilder();
                for (int i=0; i<sortArr.length; i++) {
                    builderInsert.append(Integer.toString(sortArr[i]));
                    builderInsert.append("  ");
                }
                String StringInsert = builderInsert.toString();
                lastArr.setText(StringInsert);
                break;
            case R.id.choice:
                Context contextChoice = new Context(new choiceSort());
                contextChoice.sortArr(arr);
                sortArr = contextChoice.getArr();
                sortArr = Arrays.copyOf(arr, arr.length);
                StringBuilder builderChoice = new StringBuilder();
                for (int i=0; i<sortArr.length; i++) {
                    builderChoice.append(Integer.toString(sortArr[i]));
                    builderChoice.append("  ");
                }
                String StringChoice = builderChoice.toString();
                lastArr.setText(StringChoice);
                break;
            case R.id.newArray:
                StringBuilder builder = new StringBuilder();
                for(int i=0; i<arr.length; i++){
                    arr[i] = random.nextInt(60);
                    builder.append(Integer.toString(arr[i]));
                    builder.append("  ");
                }
                String intString = builder.toString();
                firstArr.setText(intString);

                break;
            default:
        }

    }
}