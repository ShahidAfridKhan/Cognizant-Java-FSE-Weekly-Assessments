# Spring Boot

### 1. Definition

Spring Boot is a framework that makes it easy to build Spring applications with less configuration.

### 2. Why it is used

It reduces boilerplate code and helps develop applications quickly.

### 3. Main Features

* Auto Configuration
* Starter Dependencies
* Embedded Server (Tomcat)
* Spring Boot CLI
* Production Ready Features

### 4. @SpringBootApplication

It is the main annotation that starts a Spring Boot application.

### 5. Auto Configuration

Spring Boot automatically configures required beans based on the project dependencies.

### 6. Starter Dependencies

Ready-made dependency packages like:

* spring-boot-starter-web
* spring-boot-starter-data-jpa
* spring-boot-starter-test

### 7. Embedded Server

Spring Boot has built-in servers like Tomcat, Jetty, and Undertow, so no external server installation is needed.

### 8. Project Structure

* src/main/java
* src/main/resources
* application.properties
* pom.xml
* Main Application Class

### 9. Advantages

* Fast development
* Less configuration
* Embedded server
* Easy dependency management

### 10. Disadvantages

* Higher memory usage
* Less control over auto configuration

### 11. Best Practices

* Use starter dependencies.
* Keep configuration in `application.properties`.
* Follow package structure.
* Use annotations properly.

### 12. Interview Questions

* What is Spring Boot?
* What is `@SpringBootApplication`?
* What is Auto Configuration?
* What are Starter Dependencies?
* Why is an embedded server used?

### 13. Dry Run

Run Application → Spring Boot Starts → Auto Configuration → Beans Created → Embedded Tomcat Starts → Application Ready

### 14. Industry Usage

Spring Boot is widely used to build REST APIs, microservices, enterprise applications, banking systems, and cloud-based applications.
