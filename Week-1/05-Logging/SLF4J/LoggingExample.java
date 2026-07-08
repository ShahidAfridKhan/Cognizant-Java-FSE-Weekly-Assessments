package com.cognizant.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SLF4J (Simple Logging Facade for Java)
 * 
 * Logging Levels (from least to most severe):
 * TRACE - Very detailed information (rarely used)
 * DEBUG - Detailed information for diagnosing problems
 * INFO - General informational messages
 * WARN - Warning messages (potential issues)
 * ERROR - Error messages (recoverable errors)
 * FATAL - Fatal errors (application shutdown)
 * 
 * Best Practices:
 * 1. Use appropriate logging level
 * 2. Include relevant context information
 * 3. Use parameterized logging (avoid string concatenation)
 * 4. Don't log sensitive information (passwords, tokens)
 * 5. Use structured logging for production
 */
public class LoggingExample {
    
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);
    
    public static void main(String[] args) {
        logger.trace("Application started");
        logger.debug("Debug information");
        logger.info("Application running");
        logger.warn("Warning message");
        logger.error("Error occurred", new Exception("Sample exception"));
    }
    
    /**
     * Parameterized Logging - More efficient than string concatenation
     * {} is replaced with the parameter
     */
    public static void exampleParameterizedLogging(String username, int age) {
        logger.debug("User {} with age {} logged in", username, age);
        logger.info("Processing request for user: {} at time: {}", 
                    username, System.currentTimeMillis());
    }
    
    /**
     * Structured Logging
     */
    public static void structuredLogging(String user, String action, boolean success) {
        if (success) {
            logger.info("User {} performed action: {} successfully", user, action);
        } else {
            logger.warn("User {} failed to perform action: {}", user, action);
        }
    }
}

/**
 * Logger Best Practices
 * 1. Create logger as static final
 * 2. Use getLogger with class name
 * 3. Avoid logging in loops
 * 4. Don't log sensitive data
 * 5. Use appropriate log levels
 * 6. Include context information
 * 7. Use parameterized messages
 * 8. Configure appenders properly
 */
