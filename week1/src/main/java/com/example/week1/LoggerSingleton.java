package com.example.week1;

public class LoggerSingleton {
    private static LoggerSingleton instance;

    private LoggerSingleton() {
    }

    public static synchronized LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("log: " + message);
    }
}
