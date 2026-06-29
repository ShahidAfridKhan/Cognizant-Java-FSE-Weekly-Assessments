package com.example.week1;

public class Forecasting {
    public double trend(double[] data) {
        if (data == null || data.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        return sum / data.length;
    }

    public double predictNext(double[] data) {
        double average = trend(data);
        return average * 1.05;
    }
}
