# Assignment 2

This repository contains several Java programs that creates a weather forecasting simulation that predicts whether the next day will be wet or dry based on:

- The previous day's weather
- The probability of the weather changing from dry/wet to wet for a given location and month (weather data)
- A random number


## List of Programs

   - StdIn.java: This file contains a library of functions for reading input from standard input, files, and URLs.
   - StdOut.java: This file contains a library of functions for printing output to standard output, files, and other output streams.
   - StdRandom.java: This file contains a library of functions for generating random numbers and performing statistical sampling.
   - WeatherGenerator.java: This file contains a class that generates weather data in the form of temperature and humidity readings.
   - drywet.txt: This file contains weather data in the form of temperature and humidity readings, with the humidity readings being low (dry).
   - wetwet.txt: This file contains weather data in the form of temperature and humidity readings, with the humidity readings being high (wet).

#Project Description

To do this, I was given two text files: `drywet.txt` and `wetwet.txt`. `wetwet.txt` contains the probability of the next day being wet if the current day is wet, and `drywet.txt` contains the probability of the next day being wet if the current day is dry. The data in these files is organized by location and month, with the probability for each month listed in the following order: January, February, March, etc.

To generate a forecast, you will need to use a random number generator to simulate the outcome of a random event based on the probabilities listed in the text files. If it is a dry day, you will use the probabilities listed in `drywet.txt`. If it is a wet day, you will use the probabilities listed in `wetwet.txt`.

## Implementation

Each line in these text files contains data for a specific location, with the first and second numbers representing the location's longitude and latitude, and the following 12 numbers representing the probability of the next day being wet for each month (in the order listed above).

To generate a forecast, I needed to use a random number generator to simulate the outcome of a random event based on the probabilities listed in the text files. If it is a dry day, you will use the probabilities listed in `drywet.txt`. If it is a wet day, you will use the probabilities listed in `wetwet.txt`.

## Evaluation

My implemenation was evaluated based on its accuracy in predicting the next day's weather.
