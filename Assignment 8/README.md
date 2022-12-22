# Assignment 8

This repository contains several Java programs that I have written for appending a string to itself n times and another program for analyzing car leasing options and calculating the cost and carbon emissions of different vehicles.

## List of Programs

### Program 1: 
   - RecursiveAppend.java is a Java program that uses recursion to append characters to a string.

### Program 2: 
   - Fuel.java: This Java program defines a class for storing and manipulating data on the fuel efficiency of vehicles.
   - Lease.java: This Java program defines a class for storing and manipulating data on leases for vehicles.
   - LeasingCost.java: This Java program defines a class for calculating the cost of a vehicle lease.
   - StdIn.java: This Java program provides a set of static methods for reading input from the standard input stream (e.g., the keyboard).
   - StdOut.java: This Java program provides a set of static methods for printing output to the standard output stream (e.g., the console).
   - Vehicle.java: This Java program defines a class for storing and manipulating data on vehicles.
   - vehicles.txt: This text file contains data on vehicles, which can be read in and used by the other Java programs in the program.

## Project Description

### Program 1: RecursiveAppend.java

The RecursiveAppend is a Java program that uses recursive method appendNTimes that receives two arguments, a string and an integer. The method appendNTimes returns the original string appended to the original string n times.

### Program 2: Leasing Cost Analysis

The LeasingCost program calculates the total cost and carbon emissions of leasing a gasoline-powered or electric vehicle over a 36-month period. The program considers several factors in the cost calculation, including the amount due at signing, the length of the lease, the monthly cost, the mileage allowance, and the cost of a charger for electric vehicles. The program allows the user to input current fuel and electricity prices, as well as the mileage and fuel efficiency of the car they are considering.

The program also calculates the carbon emissions of the vehicle based on the fuel used for gasoline-powered cars and the electricity used to charge electric cars. The carbon emissions are calculated using data provided by the EPA on the emissions produced by gasoline and electricity generation.

The program includes several Java classes: Fuel, Lease, LeasingCost, StdIn, StdOut, Vehicle, and a text file called vehicles.txt containing data on different car models. The main class, LeasingCost, reads in data from the user and the text file and uses it to calculate the total cost and carbon emissions of the car.

# How to Run the Program

## Program 1: RecursiveAppend.java

To run the RecursiveAppend program, you will need to have the Java Development Kit (JDK) installed on your machine. Then, follow these steps:

1. Open a terminal window
2. Navigate to the directory where the Java files are located
3. Compile the Java file using the javac command, followed by the file name. For example, to compile RecursiveAppend.java, you would enter: `javac RecursiveAppend.java`
4. Run the RecursiveAppend program using the java command, followed by the class name. For example, to run the program, you would enter: `java RecursiveAppend`

## Program 2: LeasingCost.java

### How to Run the Program

To run the programs in Program 2, you will need to have the Java Development Kit (JDK) installed on your machine. Then, follow these steps:

1. Open a terminal window
2. Navigate to the directory where the Java files are located
3. Compile the Java files using the javac command, followed by the file names. For example, to compile all of the Java files, you would enter: `javac LeasingCost.java`
4. Run the program using the java command, followed by the class name of the main program you want to run. For example, to run the main program, you would enter: `java Main`

**Note:** The StdIn and StdOut libraries are required to run the programs in Program 2. Be sure to include them in the compile and run commands as shown above. The vehicles.txt file should also be located in the same directory as the Java files.
