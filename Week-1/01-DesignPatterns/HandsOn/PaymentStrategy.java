package com.cognizant.designpatterns;

/**
 * Strategy Pattern
 * Encapsulates different algorithms in separate classes
 * Allows runtime selection of algorithm
 */
public interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}

class PayPalPayment implements PaymentStrategy {
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}

class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;
    
    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin: " + walletAddress);
    }
}

// Context
class PaymentProcessor {
    private PaymentStrategy strategy;
    
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void processPayment(double amount) {
        if (strategy == null) {
            System.out.println("Payment strategy not set!");
            return;
        }
        strategy.pay(amount);
    }
}

// Test
class StrategyTest {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        
        // Pay with Credit Card
        processor.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        processor.processPayment(100.0);
        
        // Pay with PayPal
        processor.setPaymentStrategy(new PayPalPayment("user@paypal.com"));
        processor.processPayment(50.0);
        
        // Pay with Bitcoin
        processor.setPaymentStrategy(new BitcoinPayment("1A1z7agoat3WLa7R2Yhm2gro58Rk6Hs6gX"));
        processor.processPayment(75.0);
    }
}
