# IntSequentialSearcher

## Description
This Java project demonstrates the implementation of a sequential search algorithm to find a specified value in an array. The `IntSequentialSearcher` class contains a method that sequentially searches through an array of integers for a given value. The program returns the index of the found value or `-1` if the value is not present in the array. This project showcases basic array handling and search algorithms in Java.

## Author
Written by Mohammed Qutu.

## Requirements
- Java 21.0.2 or later

## Usage
To run the program, compile the `IntSequentialSearcher.java` and `SequentialSearchTest.java` files, then execute the `SequentialSearchTest` class. The program will search for a specific value in a predefined array and display the results.

### Example Output
You earned 100 on test 4

### Key Features:
- **Sequential Search Algorithm**: The `search()` method sequentially searches through an array for a specified value.
- **Basic Array Handling**: The program demonstrates how to traverse and manipulate arrays in Java.

### Methods:
- `search(int[] array, int value)`: Searches the `array` for the specified `value` and returns the index of the value if found, otherwise returns `-1`.

### Example:
```java
int[] tests = {87, 75, 98, 100, 82};
int result = IntSequentialSearcher.search(tests, 100);

if(result == -1) {
    System.out.println("You did not earn 100 on any test.");
} else {
    System.out.println("You earned 100 on test " + (result + 1));
}
