package com.example.task_6;

public class Context {
    Strategy strategy;
    int[] arr;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void sortArr(int[] arr){
        strategy.sort(arr);
    }

    public int[] getArr() {
        return arr;
    }
}
