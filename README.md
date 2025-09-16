#S1.04 - Testing

---
# Exercise Overview

##Level 1

###Exercise 1: Library Book Manager
Implements a Java class to manage a collection of books in a library. Includes adding, retrieving, and removing books by title or position. Ensures alphabetical order and prevents duplicates. Verified with JUnit tests.

###Exercise 2: DNI Letter Calculator
Implements a CalculoDni class that calculates the Spanish DNI letter given the number. Verified with a parameterized JUnit test using 10 predefined DNI numbers.

###Exercise 3: Exception Handling
Implements a class method that throws an ArrayIndexOutOfBoundsException. Verified with JUnit tests.

##Level 2

Create Java Classes and/or tests that test the classes and confirm that do the following:

###Exercise 1: Integer Equality
An assertion that proves that the value of two whole objects is equal, and another that indicates that it is not.

###Exercise 2: Object Reference Comparison
Assertions verifying when two object references are the same or different.

###Exercise 3: Array Equality
 Create an Assertion verifying that two integer arrays are identical.

###Exercise 4: ArrayList Order & Content
Create an arrayList containing various types of objects (create them too). Write an assertion to verify the order of the objects in the ArrayList as they were inserted.

- Now verify that the above list contains the objects in any order.
- Verify that, in the above list, one of the objects has been added only once. Leave one of the elements unadded, and verify that the list does not contain the latter.

###Exercise 5: Map Key Verification
- Create a map and verify that it contains one of the added keys.

###Exercise 6: Exception Assertion

- Trigger an ArrayIndexOutOfBoundsException and asserts that it is correctly thrown.

###Exercise 7: Optional Empty Assertion
- Create an empty Optional object and verifies that it is empty.

##Level 3

###Exercise 1: Calculator with TDD
Implements a Calculator class with basic operations (add, subtract, multiply, divide) using the TDD cycle:
- Create a test class called CalculatorTest.
- Write tests to verify the calculator's add, subtract, divide, and multiply methods.
- Run the tests. They should fail, since we haven't implemented the methods in the Calculator class yet.
- Create a Calculator class that contains the methods specified by the tests.
- Run the tests.
- Iterate over the process: After each iteration, continue the TDD process, rewrite the tests, refactor the code if necessary, and repeat the development cycle to improve and extend the functionality of the Calculator class.
---

# Technologies Used

- Java 19
- Maven (project management and dependencies)
- JUnit 5 (unit testing framework)
- IntelliJ IDEA 
- GitHub
---

# Requirements

- Java 19 or higher
- IntelliJ or another IDE
- JUnit 5
---

#Installation

- Clone the repository:

https://github.com/polserrano8/1.4-Testing

- Open the project in IntelliJ and ensure the Java SDK and Maven settings are properly configured.

# Execution
Run tests through your IDE's test runner or via command line.
