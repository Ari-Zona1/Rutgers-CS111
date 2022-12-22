# Assignment 4

This repository contains several Java programs that I have written. 

## List of Programs

1. FindDuplicate.java: a program that finds and prints the duplicate elements in an array of integers
2. RURottenTomatoes.java: a program that reads in a list of movie titles and ratings from Rotten Tomatoes and displays the highest rated movie

## How to Run the Programs

To run any of the programs, you will need to have the Java Development Kit (JDK) installed on your machine. Then, follow these steps:

1. Open a terminal window
2. Navigate to the directory where the Java file is located
3. Compile the Java file using the `javac` command, followed by the file name. For example, to compile FindDuplicate.java, you would enter `javac FindDuplicate.java`
4. Run the program using the `java` command, followed by the class name. For example, to run FindDuplicate.java, you would enter `java FindDuplicate`

# Project Description 

## Find a Duplicate

The `FindDuplicate` program reads in a list of integers from the command line and determines whether there are any duplicate values in the list. The input values are assumed to be integers between 1 and the number of values in the list.

Here are some examples of how the program might be used:

java FindDuplicate 2 10 8 5 4 1 3 6 7 9
Output: false

java FindDuplicate 4 5 2 1 2
Output: true


## RU Rotten Tomatoes

The `RURottenTomatoes` program takes a list of movie ratings from the command line and determines which movie has the highest sum of ratings. Ratings are assumed to be integers between 1 and 5 (inclusive). The program expects the first two arguments to be the number of reviewers and the number of movies, respectively. The remaining arguments are the movie ratings, stored in a row-major order (i.e., the first row is filled first, then the second row, etc.).

For example, the following command:

java RURottenTomatoes 3 2 4 5 3 2 1 4 5

creates a 2D array with 3 rows (reviewers) and 2 columns (movies), and the program displays the index of the movie with the highest sum of ratings. In this case, movie 0 has a sum of ratings equal to 12 while movie 1 has a sum of ratings equal to 6, so the program would output `0`.

Note: if multiple movies have the same highest sum of ratings, the program displays the movie with the lowest index.
