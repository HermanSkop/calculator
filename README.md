# Calculator Application

This Java application provides a command-line calculator with basic functionalities. It supports operations such as addition, subtraction, multiplication, division, and exponentiation.
The *main* purpose was to implement following design patterns:
- Builder pattern
- Chain of responsibility pattern
- Memento pattern

### Builder pattern
Is used to create Calculator. Two types of calculators available(can be found further) dependant on *mood* and *operations list*.
### Chain of responsibility pattern
Sequentially performs operations on input numbers if operator matches. 
### Memento pattern
Simply rolls back to previously obtained results. *Main* class works as *Caretaker* here.


## Usage

### Prerequisites
- Java Development Kit (JDK) installed

### Running the Application
1. Open a terminal or command prompt.
2. Navigate to the directory containing the compiled Java classes.
3. Run the application using the following command:
   ```bash
   java Main <calculator_type> <starting_number>
   ```
     Replace <calculator_type> with either "simple" for the basic calculator or "eng" for the engineering calculator. <starting_number> should be the initial numeric value for calculations.
     #### Example
    ```bash
    java Main simple 0
    ```
    This will start the simple calculator with an initial value of 0.

### Calculator Types

#### Simple Calculator
The simple calculator performs basic arithmetic operations, including addition, subtraction, multiplication, division.

#### Engineering Calculator
The engineering calculator extends the functionality of the simple calculator to include exponentiation, also excludes addition and substraction.

### Commands
- Input operation: Enter one of the following operators - "+", "-", "*", "/", "^" (exponentiation).
- Rollback: Type "rollback" to undo the last operation and revert to the previous result.
### Handling Errors
The application provides error handling for various scenarios:

- Incorrect number of command-line arguments.
- Invalid calculator type.
- Invalid input during calculator operations.
- Unsupported or incorrect operators.
- Rollback attempts when no operations have been performed.
### Additional Features
- Rollback: The application allows the user to undo the last operation and revert to the previous result by typing "rollback."
- Mood Feedback: The calculator expresses its mood based on the user's interactions, providing humorous feedback in case of errors or unconventional inputs.
### Notes
- The application uses a stack-based mechanism to save and restore calculator states for rollback functionality.
- A maximum of 50 states are retained in the rollback history.
- The application provides feedback messages based on the mood of the calculator.
Feel free to explore and enjoy using the command-line calculator!
