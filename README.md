# Java Banking Application
# Project Title 
Banking Application for Account Management

## Problem Statement
The objective of this project is to design and implement a simple banking application in Java that allows users to manage their bank accounts through the following operations:
- Creating new accounts


- Depositing money


- Withdrawing money


- Viewing account details


- Updating contact details


The project demonstrates the use of Java features such as control structures, arrays, and strings in a real-world scenario.

## Project Objectives
- Apply the basics of Java programming including data types, operators, control structures, and type casting.


- Utilize Java’s control structures for decision-making and looping.


- Implement basic I/O operations using the Scanner class.


- Handle arrays for managing multiple accounts.


- Manipulate strings using Java’s String class and methods. 
## Learning Outcomes
- Understand the basics of Java programming.
- Gain practical experience with control structures, arrays, and strings.
- Implement a real-world application using Java.
- Learn to manage and share code using GitHub.
## Project Instructions
### Account Class
**Attributes:**  
- `accountNumber` – Unique account number  
- `accountHolderName` – Name of the account holder  
- `balance` – Current balance  
- `email` – Email address  
- `phoneNumber` – Contact number
-  `address` – Address of the account holder   

**Methods:**  
- `deposit(double amount)` – Deposit money (validate positive amount)  
- `withdraw(double amount)` – Withdraw money (validate positive amount and sufficient balance)  
- `displayAccountDetails()` – Show account details  
- `updateContactDetails(String email, String phoneNumber,  String address)` – Update contact details  

### User Interface Class
**Attributes:**  
- Array to store multiple Account objects  
- Scanner object for input  

**Methods:**  
- `createAccount()` – Create a new account  
- `performDeposit()` – Handle deposit operations  
- `performWithdrawal()` – Handle withdrawal operations  
- `showAccountDetails()` – Display account details  
- `updateContact()` – Update contact details  
- `mainMenu()` – Display menu and handle user choices  

### Implementation Steps
1. Define the `Account` class with attributes and methods.  
2. Create the `UserInterface` class to manage accounts and interact with users.  
3. Implement methods for account creation, deposit, withdrawal, and displaying details.  
4. Use control structures and loops for menu navigation and input handling.  
5. Use arrays to manage multiple accounts.  
6. Handle strings for account holder names and contact details.  

### Sample Interaction
Welcome to the Banking Application!
1. Create a new account
2. Deposit money
3. Withdraw money
4. View account details
5. Update contact details
6. Exit

Enter your choice: 1
1. Enter account holder name: Aditya Chouhan
2. Enter initial deposit amount: 1000
3. Enter email address: adityachouhan@outlook.com
4. Enter phone number: 1234567890
5. Account created successfully with Account Number: 1001
   
## Screenshots
### Account Creation

   <img width="508" height="289" alt="Screenshot 2025-08-29 152655" src="https://github.com/user-attachments/assets/83d8dcaa-aa08-493f-a181-6d44a8641472" />
   <img width="480" height="354" alt="Screenshot 2025-08-29 152733" src="https://github.com/user-attachments/assets/078255cb-e3fb-4622-b352-494a71ebb3d0" />



## Author
- Name - Aditya Chouhan
- Roll no. - 2401830001
- Course - B.Sc. (H) Cybersecurity 
