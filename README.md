# CTS Digital Nurture 5.0 - Complete Java DSA Training

Welcome to the comprehensive Cognizant DSA (Data Structures & Algorithms) and Java training program. This repository contains production-quality implementations of core Java concepts taught at Cognizant interview level.

## 📚 Curriculum Overview

### Week 1 Content

#### 1. Design Patterns (01-DesignPatterns)
- **Singleton Pattern**: Thread-safe singleton implementations
  - Eager initialization
  - Lazy initialization
  - Bill Pugh singleton
  
- **Factory Pattern**: Object creation without specifying exact classes
  
- **Builder Pattern**: Constructing complex objects step by step
  
- **Observer Pattern**: One-to-many dependency implementation
  
- **Strategy Pattern**: Encapsulating different algorithms

#### 2. Data Structures & Algorithms (02-DataStructures)

**Big O Analysis**
- Time & Space Complexity
- Complexity Classes: O(1), O(log n), O(n), O(n log n), O(n²), O(2ⁿ)

**Arrays**
- Memory representation
- Insert, Delete, Traverse, Search operations
- Advantages and Disadvantages

**Linked Lists**
- Singly Linked Lists
- Doubly Linked Lists
- Insert, Delete, Traversal operations
- Time Complexity Analysis

**Searching**
- Linear Search: O(n)
- Binary Search: O(log n)
- Comparison and use cases

**Sorting**
- Bubble Sort: O(n²)
- Quick Sort: O(n log n)
- Merge Sort: O(n log n)
- Insertion Sort: O(n²)
- Stable and in-place sorting

**Recursion**
- Base cases and recursive cases
- Factorial, Fibonacci, Power
- Tail recursion optimization
- Time and space complexity

#### 3. Test Driven Development (04-TestDrivenDevelopment)
- JUnit 5 fundamentals
- Test annotations (@Test, @BeforeEach, @AfterEach)
- Assertions (assertEquals, assertTrue, assertThrows)
- Test naming conventions
- AAA Pattern (Arrange, Act, Assert)

#### 4. Logging Framework (05-Logging)
- SLF4J (Simple Logging Facade for Java)
- Logging levels (TRACE, DEBUG, INFO, WARN, ERROR)
- Parameterized logging
- Best practices for production logging

## 📂 Project Structure

```
CTS-Digital-Nurture-5.0/
├── Week-1/
│   ├── 01-DesignPatterns/
│   │   ├── HandsOn/
│   │   │   ├── Singleton.java
│   │   │   ├── Factory.java
│   │   │   ├── Builder.java
│   │   │   ├── Observer.java
│   │   │   └── Strategy.java
│   │   └── Theory/
│   │
│   ├── 02-DataStructures/
│   │   ├── HandsOn/
│   │   │   ├── BigO.java
│   │   │   ├── LinkedList.java
│   │   │   ├── Sorting.java
│   │   │   ├── Searching.java
│   │   │   └── Recursion.java
│   │   └── Theory/
│   │
│   ├── 04-TestDrivenDevelopment/
│   │   ├── JUnit/
│   │   │   ├── Calculator.java
│   │   │   └── CalculatorTest.java
│   │   └── Theory/
│   │
│   └── 05-Logging/
│       ├── SLF4J/
│       │   └── LoggingExample.java
│       └── Theory/
│
└── pom.xml
```

## 🛠️ Setup Instructions

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher
- Git

### Installation

1. Clone the repository:
```bash
git clone https://github.com/ShahidAfridKhan/Cognizant-Java-FSE-Weekly-Assessments.git
cd CTS-Digital-Nurture-5.0
```

2. Build the project:
```bash
mvn clean install
```

3. Run tests:
```bash
mvn test
```

4. Compile:
```bash
mvn compile
```

## 📖 Key Concepts

### Design Patterns
- **Singleton**: Ensures single instance across JVM
- **Factory**: Decouples object creation from usage
- **Builder**: Step-by-step object construction
- **Observer**: Notify multiple objects of state changes
- **Strategy**: Select algorithm at runtime

### Big O Complexity
```
O(1)     - Constant Time
O(log n) - Logarithmic (Binary Search)
O(n)     - Linear (Linear Search)
O(n log n) - Linearithmic (Merge Sort, Quick Sort)
O(n²)    - Quadratic (Bubble Sort)
O(n³)    - Cubic (Matrix Multiplication)
O(2ⁿ)    - Exponential
O(n!)    - Factorial
```

### Linked List Operations
| Operation | Time Complexity |
|-----------|-----------------|
| Insert at beginning | O(1) |
| Insert at end | O(n) |
| Insert at position | O(n) |
| Delete | O(n) |
| Search | O(n) |
| Traverse | O(n) |

### Sorting Comparison
| Algorithm | Best | Average | Worst | Space | Stable |
|-----------|------|---------|-------|-------|--------|
| Bubble | O(n²) | O(n²) | O(n²) | O(1) | Yes |
| Quick | O(n log n) | O(n log n) | O(n²) | O(log n) | No |
| Merge | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes |
| Insertion | O(n) | O(n²) | O(n²) | O(1) | Yes |

## 🧪 Running Tests

Run all tests:
```bash
mvn test
```

Run specific test class:
```bash
mvn test -Dtest=CalculatorTest
```

Run with coverage:
```bash
mvn test jacoco:report
```

## 📝 Example Usage

### Singleton Pattern
```java
Singleton logger = Singleton.getInstance();
logger.log("Application started");
```

### Linked List
```java
LinkedList<Integer> list = new LinkedList<>();
list.insertAtEnd(10);
list.insertAtEnd(20);
list.traverse();
```

### Sorting
```java
int[] arr = {64, 34, 25, 12, 22, 11, 90};
Sorting.quickSort(arr);
Sorting.printArray(arr);
```

### Recursion
```java
int result = Recursion.factorial(5);  // 120
int fib = Recursion.fibonacci(10);    // 55
```

## 📊 Interview Questions

### Design Patterns
1. Why Singleton? Explain thread-safety
2. Difference between Singleton and Static class
3. When to use Factory pattern
4. Explain Observer pattern with real-world example
5. When should we use Builder pattern

### Data Structures
1. Explain Big O notation with examples
2. Compare Linear vs Binary Search
3. When can Binary Search not be used?
4. Difference between Stable and Unstable sorting
5. What is tail recursion?

### Testing
1. What is TDD? Explain with example
2. Difference between @Before and @BeforeEach
3. How to test exceptions with JUnit
4. What is AAA pattern in testing
5. Explain mocking and stubbing

### Logging
1. Logging levels and when to use them
2. Why use SLF4J instead of System.out?
3. Difference between DEBUG and TRACE
4. How to avoid logging sensitive data
5. What is structured logging

## 🎯 Learning Path

1. **Start with Design Patterns** - Understand core patterns used in enterprise apps
2. **Master Data Structures** - Foundation for algorithms
3. **Learn Sorting & Searching** - Most frequently asked in interviews
4. **Practice Recursion** - Build problem-solving skills
5. **Test Your Code** - TDD is industry standard
6. **Implement Logging** - Production-ready code requires proper logging

## 📚 Resources

- [Java 11 Documentation](https://docs.oracle.com/en/java/javase/11/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [SLF4J Manual](http://www.slf4j.org/manual.html)
- [Refactoring.Guru - Design Patterns](https://refactoring.guru/design-patterns/java)

## 💡 Tips for Success

1. **Understand before memorizing** - Focus on understanding concepts
2. **Practice consistently** - Code every day
3. **Write test cases** - Test-driven development
4. **Analyze complexity** - Always think about Big O
5. **Optimize solutions** - Look for better algorithms
6. **Read clean code** - Study well-written code
7. **Practice interview questions** - Prepare thoroughly

## 🚀 Next Steps

- Week 2: Advanced concepts and Spring Boot
- Week 3: System Design and Architecture
- Week 4: Mock interviews and assessments

## 🤝 Contributing

Contributions are welcome! Please feel free to submit pull requests.

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## ✉️ Contact

For questions or suggestions, reach out to the training team.

---

**Happy Learning! 🎉**

Last Updated: 2026-07-08
Version: 1.0.0
