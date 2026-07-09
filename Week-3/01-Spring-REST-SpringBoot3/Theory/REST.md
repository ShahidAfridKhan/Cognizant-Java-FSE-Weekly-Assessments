# REST

### 1. Definition

REST (Representational State Transfer) is an architecture used to build web services.

### 2. Why it is used

It helps different applications communicate over HTTP.

### 3. Principles

* Stateless
* Client-Server
* Resource Based
* Cacheable
* Uniform Interface

### 4. HTTP Methods

* GET - Read data
* POST - Add data
* PUT - Update all data
* PATCH - Update some data
* DELETE - Remove data

### 5. Idempotency

Calling the same request multiple times gives the same result.

Example:

* GET ✅ Idempotent
* PUT ✅ Idempotent
* DELETE ✅ Idempotent
* POST ❌ Not Idempotent

### 6. HATEOAS

The server sends links with the response so the client knows what action to perform next.

### 7. Content Negotiation

The client tells the server which format it wants, like JSON or XML.

### 8. Advantages

* Simple
* Fast
* Scalable
* Easy to use

### 9. Disadvantages

* Stateless
* No fixed standard

### 10. Best Practices

* Use proper HTTP methods.
* Use meaningful URLs.
* Return correct status codes.
* Use JSON in APIs.

### 11. Interview Questions

* What is REST?
* What are REST principles?
* What is idempotency?
* Difference between PUT and PATCH?
* What is HATEOAS?

### 12. Dry Run

Client → GET /books → Server → JSON Response → Client

### 13. Industry Usage

REST APIs are used in Spring Boot, mobile apps, websites, cloud services, and microservices.
