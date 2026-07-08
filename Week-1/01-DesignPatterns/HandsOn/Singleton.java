package com.cognizant.designpatterns;

/**
 * Singleton Pattern - Thread Safe Implementation
 * Ensures only one instance of Logger exists throughout the application
 * 
 * Questions:
 * 1. Why Singleton? - Single point of access, control instantiation
 * 2. How does Singleton work? - Private constructor, static instance
 * 3. Why is constructor private? - Prevent external instantiation
 * 4. Why is instance static? - To maintain single instance across JVM
 * 5. How to make Singleton thread-safe? - Synchronized or Eager/Lazy Initialization
 * 6. Difference between Singleton and Static class? - Singleton is instance-based, Static is class-based
 */
public class Singleton {
    
    // Eager Initialization - Thread Safe but memory overhead
    private static final Singleton INSTANCE = new Singleton();
    
    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }
    
    // Static method to get instance
    public static Singleton getInstance() {
        return INSTANCE;
    }
    
    // Business method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

/**
 * Lazy Initialization - Creates instance only when needed
 */
class SingletonLazy {
    private static SingletonLazy instance;
    
    private SingletonLazy() {
        System.out.println("Lazy Singleton instance created");
    }
    
    // Thread-safe lazy initialization using synchronized
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
    
    public void log(String message) {
        System.out.println("[LOG - LAZY] " + message);
    }
}

/**
 * Bill Pugh Singleton - Best practice (Uses class loader)
 */
class SingletonBillPugh {
    
    private SingletonBillPugh() {
        System.out.println("Bill Pugh Singleton instance created");
    }
    
    private static class SingletonHelper {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }
    
    public static SingletonBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
    
    public void log(String message) {
        System.out.println("[LOG - BILL PUGH] " + message);
    }
}

// Test Class
class SingletonTest {
    public static void main(String[] args) {
        // Test Eager Singleton
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Eager: s1 == s2 ? " + (s1 == s2)); // true
        
        // Test Lazy Singleton
        SingletonLazy sl1 = SingletonLazy.getInstance();
        SingletonLazy sl2 = SingletonLazy.getInstance();
        System.out.println("Lazy: sl1 == sl2 ? " + (sl1 == sl2)); // true
        
        // Test Bill Pugh Singleton
        SingletonBillPugh sb1 = SingletonBillPugh.getInstance();
        SingletonBillPugh sb2 = SingletonBillPugh.getInstance();
        System.out.println("Bill Pugh: sb1 == sb2 ? " + (sb1 == sb2)); // true
    }
}
