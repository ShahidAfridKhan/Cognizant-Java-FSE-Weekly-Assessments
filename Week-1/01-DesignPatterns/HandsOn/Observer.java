package com.cognizant.designpatterns;

import java.util.*;

/**
 * Observer Pattern
 * Defines one-to-many dependencies between objects
 * Notifies all observers when state changes
 */
public interface Observer {
    void update(String message);
}

class EmailObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Email Notification: " + message);
    }
}

class SMSObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("SMS Notification: " + message);
    }
}

class PushObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Push Notification: " + message);
    }
}

// Subject
class NotificationService {
    private List<Observer> observers = new ArrayList<>();
    
    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
    
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// Test
class ObserverTest {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        
        Observer email = new EmailObserver();
        Observer sms = new SMSObserver();
        Observer push = new PushObserver();
        
        service.subscribe(email);
        service.subscribe(sms);
        service.subscribe(push);
        
        service.notify("New order received!");
    }
}
