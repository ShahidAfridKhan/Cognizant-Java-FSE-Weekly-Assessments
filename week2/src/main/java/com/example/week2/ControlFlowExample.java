package com.example.week2;

public class ControlFlowExample {
    public String plan(int month) {
        if (month < 4) {
            return "start quarter one";
        }
        if (month < 7) {
            return "start quarter two";
        }
        if (month < 10) {
            return "start quarter three";
        }
        return "start quarter four";
    }

    public int total(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}
