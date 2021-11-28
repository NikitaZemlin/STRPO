package com.example.task_6.Sorts;

import com.example.task_6.Strategy;

public class choiceSort implements Strategy {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = arr[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = arr[j];
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;    // меняем местами наименьший с array[i]
        }
    }
}
