# Calculator Project

A multi-level implementation of a calculator application showcasing different programming concepts and progressive improvements in Java.


## Implementation Highlights
- Level 1: Procedural implementation
- Level 2: Object-oriented implementation
- Level 3: Generic and functional implementation with streams


## Project Structure
```
src/main/java/org/example/calculator/
├── lv1/
│   └── Calculator.java
├── lv2/
│   ├── App.java
│   ├── Calculator.java
│   └── Validator.java
└── lv3/
├── App.java
├── ArithmeticCalculator.java
└── enums/
└── OperatorType.java
```
## Features by Level

### Level 1: Basic Calculator
- Simple command-line calculator implementation
- Basic arithmetic operations (+, -, *, /)
- Features:
    - Input validation for positive integers
    - Error handling with try-catch blocks
    - Exit command functionality
    - Protection against division by zero
    - Continuous operation (while loop)

### Level 2: Enhanced Calculator
- Object-oriented implementation with separated concerns
- Features:
    - Results history tracking and management
    - Result removal functionality
    - Immutable results list (defensive copying)

### Level 3: Advanced Calculator
- Generic implementation with enhanced features
- Features:
    - Generic type parameter for number types
    - Enum-based operator handling
    - Stream API usage for result filtering
    - Double precision calculations
    - Lambda expressions
    - Threshold-based filtering capability


### Error Handling
- Comprehensive exception handling
- Custom validation rules
- User-friendly error messages
- Type-specific error handling

### Input Validation
- Positive number validation
- Operator validation
- Division by zero prevention
- Input type checking

## How to Use

### Basic Operations
1. Run the application
2. Enter the first number (positive numbers only)
3. Enter the second number (positive numbers only)
4. Choose an operator:
    - Level 1 & 2: +, -, *, /
    - Level 3: ADD, SUBTRACT, MULTIPLY, DIVIDE
5. View the result
6. Exit using 'exit' command

### Additional Features (Level 2 & 3)
- View calculation history
- Remove previous results
- Filter results (Level 3)

## Technical Requirements
- Java 17 or higher (for switch expressions)


## Future Improvements
- GUI implementation
- Decimal number support
- More complex mathematical operations
- Persistent storage of calculations
- Unit test coverage

## Links
- [TIL 정리](https://velog.io/@alia/JS와-비교하며-자바와-익숙해지기)