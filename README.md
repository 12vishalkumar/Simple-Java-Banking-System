# Simple Java Banking System

## Overview
This Java project simulates a basic banking system. It allows for the creation of bank accounts, depositing money into these accounts, and displaying account information. The system is built using object-oriented principles, encapsulating attributes and behaviors within `Bank` and `Account` classes.

## Project Structure
The project consists of two main classes:
- `Account`: Represents a bank account with basic functionalities such as deposits.
- `Bank`: Manages multiple `Account` instances, allowing for adding accounts, performing transactions, and displaying account details.

Additionally, there's a `BankingSystem` class that serves as the entry point for running the bank operations simulated within the `main` method.

### Account Class
This class encapsulates the details and operations of a bank account. Attributes include:
- `accountNumber`: A unique identifier for the account.
- `customerName`: The name of the account holder.
- `balance`: Current balance of the account.

Methods include:
- `deposit(double amount)`: Adds the specified amount to the account balance.

### Bank Class
Manages a collection of `Account` objects. Key functionalities include:
- `addAccount(String accountNumber, String customerName, double balance)`: Creates a new account and adds it to the bank.
- `displayAccountInfo(String accountNumber)`: Prints details of a specific account.
- `performTransaction(String accountNumber, double amount)`: Processes a deposit into a specified account.

### BankingSystem Class
Contains the `main` method where the bank operations are initialized. This class demonstrates the creation of accounts, performing transactions, and displaying account information.

## Usage
To run this system:
1. Ensure Java is installed on your system.
2. Compile the Java files using `javac BankingSystem.java`.
3. Run the compiled class with `java BankingSystem`.

The main method includes hardcoded examples of creating accounts and performing transactions, which can be modified to test different scenarios.

## Example Output
When run, the program will display transaction details and account information in the console, reflecting the operations performed as specified in the `main` method.

## Future Improvements
- Implement withdrawal functionality.
- Add error handling for negative deposit amounts.
- Include user interaction to dynamically accept input during runtime.

## Conclusion
This simple Java banking system demonstrates basic object-oriented programming principles and is intended for educational purposes. It provides a foundational framework that can be expanded with additional banking features and improved user interaction.
