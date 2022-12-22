# Assignment 2

This repository contains several Java programs that I have written. 

## List of Programs

1. HelloWorld.java: a simple program that prints "Hello, World!" to the console
2. OrderCheck.java: a program that checks whether a given order is valid or not
3. WindChill.java: a program that calculates the wind chill temperature based on the current temperature and wind speed

## How to Run the Programs

To run any of the programs, you will need to have the Java Development Kit (JDK) installed on your machine. Then, follow these steps:

1. Open a terminal window
2. Navigate to the directory where the Java file is located
3. Compile the Java file using the `javac` command, followed by the file name. For example, to compile HelloWorld.java, you would enter `javac HelloWorld.java`
4. Run the program using the `java` command, followed by the class name. For example, to run HelloWorld.java, you would enter `java HelloWorld`

## Hello, World

This is a simple program that prints "Hello, World!" to the console. When run, the program should display the following:

% java HelloWorld
Hello, World


## Wind chill

This program calculates the wind chill temperature based on the current temperature and wind speed. The wind chill temperature is defined by the National Weather Service as follows:

w = 35.74 + 0.6215 T + (0.4275 T – 35.75) v^0.16

The program takes two double command-line arguments: `temperature` and `velocity`. These represent the current temperature (in degrees Fahrenheit) and wind speed (in miles per hour), respectively. The program then calculates and prints the wind chill temperature.

**NOTE:** The formula is not valid if `T` is larger than 50 in absolute value or if `v` is larger than 120 or less than 3. Assume that the input values testing your program are in range. It is not necessary to round the wind chill value, the program should display the value that is computed. Do not use loops for this program.

Here is an example of how the program should be used:

% java WindChill 35.0 10.0
27.445420


## Order check

This program checks whether a given order is valid or not. The program takes four int command-line arguments: `w`, `x`, `y`, and `z`. The program defines a boolean variable whose value is `true` if the four values are either in strictly ascending order (`w < x < y < z`) or strictly descending order (`w > x > y > z`), and `false` otherwise. The program then displays the boolean variable value.

**NOTE:** Do not use if statements on this program. Assume that the inputs will always be integers.

Here is an example of how the program should be used:

% java OrderCheck 5 10 15 2
false

% java OrderCheck 15 11 9 4
true
