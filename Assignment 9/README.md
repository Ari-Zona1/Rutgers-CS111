# Assignment 9

This repository contains several Java programs that I have written for managing heart transplant patients and selecting the best patient for a heart transplant surgery.

## List of Programs

- HeartTransplant.java: This Java program defines a class for storing and manipulating data on heart transplant patients and selecting the best patient for a heart transplant surgery.
- HeartTransplantDriver.java: This Java program runs the HeartTransplant program and tests the methods within it.
- Patient.java: This Java program defines a class for storing and manipulating data on heart transplant patients.
- StdIn.java: This Java program provides a set of static methods for reading input from the standard input stream (e.g., the keyboard).
- StdOut.java: This Java program provides a set of static methods for printing output to the standard output stream (e.g., the console).
- StdRandom.java: This Java program provides a set of static methods for generating random numbers.
- SurvivabilityByAge.java: This Java program defines a class for storing and manipulating data on the survivability of heart transplant patients by age.
- SurvivabilityByCause.java: This Java program defines a class for storing and manipulating data on the survivability of heart transplant patients by heart condition cause.
- data.txt: This text file contains data on heart transplant patients and survivability rates, which can be read in and used by the HeartTransplant program.

## Project Description

### Heart Transplant Selection

The HeartTransplant program selects the best patient for a heart transplant surgery by comparing the patient's blood type to the donor heart and using various variables such as the patient's state of health, cause of their heart condition, and the urgency of the transplant to determine the best match. The program also includes data on the survivability of heart transplant patients by age and by heart condition cause, which is used to select the best patient.

The program includes several Java classes: HeartTransplant, HeartTransplantDriver, Patient, StdIn, StdOut, StdRandom, SurvivabilityByAge, and SurvivabilityByCause, as well as a text file called data.txt containing data on heart transplant patients and survivability rates. The main class, HeartTransplant, reads in data from the text file and uses it to select the best patient for a heart transplant surgery.

# How to Run the Program

To run the HeartTransplant program, you will need to have the Java Development Kit (JDK) installed on your machine. Then, follow these steps:

1. Open a terminal window
2. Navigate to the directory where the Java files are located
3. Compile the Java files using the javac command, followed by the file name HeartTransplantDriver. For example, to compile HeartTransplantDriver.java, you would enter: 

javac HeartTransplantDriver

4. Run the HeartTransplantDriver program using the java command, followed by the class name and the file data.txt redirected as input. For example, to run the program with data.txt as input, you would enter: 

java HeartTransplantDriver < data.txt

**Note:** The data.txt file can be read using the StdIn library functions StdIn.readInt() and StdIn.readDouble(). Be sure to include the StdIn library in the compile and run commands as shown above.
