# Assignment Goal

The goal of this assignment is to create a weather forecasting simulation that predicts whether the next day will be wet or dry based on:

- The previous day's weather
- The probability of the weather changing from dry/wet to wet for a given location and month (weather data)
- A random number

To do this, we will be given two text files: `drywet.txt` and `wetwet.txt`. `wetwet.txt` contains the probability of the next day being wet if the current day is wet, and `drywet.txt` contains the probability of the next day being wet if the current day is dry. The data in these files is organized by location and month, with the probability for each month listed in the following order: January, February, March, etc.

To generate a forecast, you will need to use a random number generator to simulate the outcome of a random event based on the probabilities listed in the text files. If it is a dry day, you will use the probabilities listed in `drywet.txt`. If it is a wet day, you will use the probabilities listed in `wetwet.txt`.

## Implementation

You will be given two text files: `drywet.txt` and `wetwet.txt`. Each line in these files contains data for a specific location, with the first and second numbers representing the location's longitude and latitude, and the following 12 numbers representing the probability of the next day being wet for each month (in the order listed above).

To generate a forecast, you will need to use a random number generator to simulate the outcome of a random event based on the probabilities listed in the text files. If it is a dry day, you will use the probabilities listed in `drywet.txt`. If it is a wet day, you will use the probabilities listed in `wetwet.txt`.

## Evaluation

Your implementation will be evaluated based on its accuracy in predicting the next day's weather. You will be given a list of locations and the actual weather for each day, and your implementation should predict the weather for the next day based on this information. Your implementation will be considered correct if it correctly predicts the next day's weather for at least 80% of the locations.
