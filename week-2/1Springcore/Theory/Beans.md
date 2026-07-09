# Bean

### 1. Definition

A Bean is an object that is created and managed by the Spring container.

### 2. Why it is used

It helps Spring create and manage objects automatically.

### 3. How it works

We create a bean in XML or using annotations. Spring creates the object and gives it whenever it is needed.

### 4. Real-time Example

BookService, BookRepository, DataSource, Controller.

### 5. Java Example

```java
@Bean
public DataSource dataSource(){
    ...
}
```

### 6. Diagram

```
Application
     |
ApplicationContext
     |
    Bean
     |
 Object Created
```

### 7. Advantages

* Easy object management
* Less code
* Reusable objects
* Supports dependency injection

### 8. Disadvantages

* Small projects may not need it
* Takes time to understand for beginners

### 9. Common Mistakes

* Using one bean object to store different users' data.

### 10. Best Practices

* Keep beans stateless whenever possible.
* Use the correct bean scope.

### 11. Interview Questions

* What is a Bean?
* Who creates a Bean?
* What are Bean scopes?
* What is Bean lifecycle?

### 12. Dry Run

Spring starts → Reads configuration → Creates Bean → Stores Bean → Gives Bean when required.

### 13. Industry Usage

Almost every Spring Boot application uses Beans for services, repositories, controllers, and configurations.
