# Banking Program

A simple command-line banking application written in Java that allows users to manage a single account with basic banking operations.

## Description

This program simulates a basic banking system where users can check their balance, deposit money, withdraw money, and exit the program. It demonstrates fundamental programming concepts including loops, conditionals, methods, and user input handling.

## Features

- **Show Balance**: Display the current account balance
- **Deposit**: Add money to the account
- **Withdraw**: Remove money from the account (with validation)
- **Exit**: Close the program

## How It Works

1. The program starts with an initial balance of $0.00
2. A menu displays four options for the user to choose from
3. Based on the user's choice (1-4), the program executes the corresponding action
4. The program continues running until the user selects option 4 (EXIT) or enters an invalid choice

## Input Validation

- **Deposits**: Cannot be negative amounts
- **Withdrawals**: Cannot be negative amounts or exceed the current balance
- **Menu Selection**: Invalid choices (not 1-4) will terminate the program

## Usage

1. Compile the program:
```bash
javac Main.java
```

2. Run the program:
```bash
java Main
```

3. Follow the on-screen menu:
   - Enter `1` to view your current balance
   - Enter `2` to deposit money
   - Enter `3` to withdraw money
   - Enter `4` to exit the program

## Example Session

```
***************
BANKING PROGRAM
***************
1. Show balance
2. Deposit
3. Withdraw
4. EXIT
***************
Enter your choice (1-4): 2
Enter an amount to deposit: 100.50
***************
BANKING PROGRAM
***************
1. Show balance
2. Deposit
3. Withdraw
4. EXIT
***************
Enter your choice (1-4): 1
$100.5
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Notes

- The program terminates on invalid menu choices (any number other than 1-4)
- All monetary values are handled as `double` data types
- The balance persists throughout the session but resets when the program is restarted
