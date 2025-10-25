# CS415 Task 3 - Simple Java Project

## About
This repository contains a sample Java project created as part of the CS415 course tasks. The project includes a basic `Calculator` class with methods for addition and subtraction, along with corresponding unit tests using JUnit 5. The goal is to practice Java programming, Maven build configuration, and Git version control.

## Project Description
- **Purpose**: This is a learning exercise to implement a simple calculator and ensure code quality through automated testing.
- **Features**:
  - A `Calculator` class with `add` and `subtract` methods.
  - Unit tests in `CalculatorTest.java` to verify functionality.
  - Configured with Maven for dependency management and testing.
- **Status**: The code has been written and pushed to this repository, but the GitHub Actions workflow for automated testing has not been added yet.

## Setup Instructions
1. **Prerequisites**:
   - Java 11 or higher.
   - Maven 3.6.0 or higher.
   - IntelliJ IDEA or another Java IDE (recommended).
2. **Clone the Repository**:
   ```bash
   git clone https://github.com/Ahmed3zzeldeen/cs415-task-3.git
   ```

3. **Navigate to the Project:**:

    ```bash
    cd cs415-task-3
    ```

4. **Build the Project**:

    ```bash
    mvn clean install
    ``` 

5. **Run Tests**:
    
    ```bash
    mvn test
    ```

## Project Structure

```
cs415-task-3/
├── src/
│   ├── main/java/com/example/calculator/Calculator.java
│   └── test/java/com/example/calculator/CalculatorTest.java
├── pom.xml
└── README.md
```

## Future Work
- [ ] Implement GitHub Actions workflow for automated testing on push and pull requests.
- [ ] Dockerize the application for easier deployment and testing. (as a part of future tasks)
