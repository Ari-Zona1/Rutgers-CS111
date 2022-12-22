#Assignment 8

This repository contains several Java programs that I have written for analyzing car leasing options and calculating the cost and carbon emissions of different vehicles.

##List of Programs

###Program 1: 
    RecursiveAppend.java is a Java program that uses recursion to append characters to a string.

###Program 2: 
    Fuel.java: This Java program defines a class for storing and manipulating data on the fuel efficiency of vehicles.
    Lease.java: This Java program defines a class for storing and manipulating data on leases for vehicles.
    LeasingCost.java: This Java program defines a class for calculating the cost of a vehicle lease.
    StdIn.java: This Java program provides a set of static methods for reading input from the standard input stream (e.g., the keyboard).
    StdOut.java: This Java program provides a set of static methods for printing output to the standard output stream (e.g., the console).
    Vehicle.java: This Java program defines a class for storing and manipulating data on vehicles.
    vehicles.txt: This text file contains data on vehicles, which can be read in and used by the other Java programs in the program.

## Project Description

Sierpinski Triangle

The Sierpinski program generates a Sierpinski triangle of a specified order using the sierpinski() function. The sierpinski() function takes four arguments: an integer order n, and three doubles representing the x and y coordinates and length of the largest filled triangle. The sierpinski() function should draw one filled equilateral triangle (pointed downwards) and then call itself recursively three times (with an appropriate stopping condition). The function should draw 1 filled triangle for n = 1; 4 filled triangles for n = 2; and 13 filled triangles for n = 3; and so forth.

The Sierpinski program also includes the height() function, which calculates the height of an equilateral triangle given its side length, and the filledTriangle() function, which draws a filled equilateral triangle with the specified x and y coordinates and side length.

The main() function takes an integer command-line argument n, draws the outline of an equilateral triangle (pointed upwards) of length 1, whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0), and draws a Sierpinski triangle of order n that fits snugly inside the outline.

## How to Run the Program

To run the Sierpinski program, you will need to have the Java Development Kit (JDK) installed on your machine. Then, follow these steps:

1. Open a terminal window
2. Navigate to the directory where the Java files are located
3. Compile the Java files using the javac command, followed by the file names. For example, to compile Sierpinski.java, you would enter:
    javac Sierpinski.java 
4. Run the Sierpinski program using the java command, followed by the class name and the desired order of the Sierpinski triangle. For example, to generate a Sierpinski triangle of order 3, you would enter:
    java Sierpinski 3

Note: The StdDraw, StdIn, and StdOut libraries are required to run the Sierpinski program. Be sure to include them in the compile and run commands as shown above.
