package com.cognizant.designpatterns;

/**
 * Builder Pattern
 * Constructs complex objects step by step
 * Provides better readability and flexibility
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;
    private String address;
    
    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    
    // Builder Class
    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String phone;
        private String address;
        
        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        
        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }
        
        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }
        
        public PersonBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }
        
        public Person build() {
            return new Person(this);
        }
    }
}

// Test
class BuilderTest {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John", "Doe")
                .age(30)
                .email("john@example.com")
                .phone("123-456-7890")
                .address("123 Main St")
                .build();
        
        System.out.println(person);
    }
}
