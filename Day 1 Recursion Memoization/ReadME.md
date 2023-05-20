# Fibonacci and Pascal's Triangle

This folder contains two files: one focusing on Fibonacci numbers using recursive, iterative, and memoization methods, and the other file containing an assignment for Day 1 which implements Pascal's Triangle using recursive, iterative, and memoization methods.

## Fibonacci

The `Fibonacci.java` file demonstrates different approaches to calculate Fibonacci numbers:

- Recursive Method: The Fibonacci sequence is calculated recursively by summing the two preceding numbers.
- Iterative Method: The Fibonacci sequence is calculated iteratively using a loop and updating variables.
- Memoization Method: The Fibonacci sequence is calculated using memoization to store previously calculated values.

## Pascal's Triangle

The `Assignment1.java` file contains an assignment solution for Day 1, which focuses on generating Pascal's Triangle using recursive, iterative, and memoization methods. The triangle is printed in a triangle shape format.

### Recursive Approach

The recursive approach uses recursive function calls to calculate each Pascal number by considering base cases and the summation of the left and right Pascal numbers from the previous row.

### Iterative Approach

The iterative approach generates Pascal's Triangle by using nested loops to calculate and store each Pascal number. It follows a bottom-up approach and stores the values in a 2D array.

### Memoization Approach

The memoization approach enhances the recursive method by caching previously calculated Pascal numbers. It uses a memoization array to store and retrieve values to avoid redundant calculations.

## Usage

You can run the respective files using a Java compiler or integrated development environment (IDE). Make sure you have Java installed on your system. You can modify the code or use the provided implementations to understand the concepts of Fibonacci numbers and Pascal's Triangle.

Feel free to explore and experiment with the code!

