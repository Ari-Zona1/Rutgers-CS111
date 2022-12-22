# Assignment 3

This repository contains several Java programs that I have written.

## List of Programs

1. CheckDigit.java: a program that calculates the check digit for a given number
2. LargestOfFive.java: a program that determines the largest of five numbers
3. RandomWalker.java: a program that simulates a random walk and displays the path taken

## How to Run the Programs

To run any of the programs, you will need to have the Java Development Kit (JDK) installed on your machine. Then, follow these steps:

1. Open a terminal window
2. Navigate to the directory where the Java file is located
3. Compile the Java file using the `javac` command, followed by the file name. For example, to compile `CheckDigit.java`, you would enter `javac CheckDigit.java`
4. Run the program using the `java` command, followed by the class name. For example, to run `CheckDigit.java`, you would enter `java CheckDigit`

# Project Description 

## Largest of Five

This program reads in 5 distinct integers and displays the largest value. It is assumed that the input values are distinct integers. Here are some examples of how the program can be run:

java LargestOfFive 17 23 5 1 6
23

java LargestOfFive 8 3 -8 4 1
8


## Check Digit

The `CheckDigit` program takes a 12 or 13-digit long as a command-line argument and displays the digit computed according to the following steps:

1. Take for an example the number 048231312622. Sum every other digit of the code, starting from the right. In the example, that is 2 + 6 + 1 + 1 + 2 + 4 = 16. Discard the tens digit and keep the ones digit, 6.
2. Start with the second to last digit and do the same thing. Sum the digits, discard the tens digit and keep the ones digit. In this example this is 2 + 2 + 3 + 3 + 8 + 0=18. Discarding the 10 leaves 8. Multiply this number by 3 and again discard the tens digit. 8×3 = 24, leaving 4.
3. Add the numbers from steps 1 and 2. Again drop the tens digit. 6 + 4 = 10, leaving the digit 0 (zero).

Here are some examples of how the program can be run:

java CheckDigit 048231312622
0

java CheckDigit 9780470454310
8


## Two-dimensional Random Walk

The `RandomWalker` program simulates the behavior of a particle moving in a grid of points. At each step, the random walker moves north, south, east, or west with probability equal to 1/4, independent of previous moves. The program takes an int command-line argument `n` and simulates the motion of a random walk for `n` steps. It prints the location at each step (including the starting point), treating the starting point as the origin (0, 0). The program also
