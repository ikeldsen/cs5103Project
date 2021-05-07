# CS 5103 Big Number Computation Project

## How to run the code

1. Clone the project at https://github.com/ikeldsen/cs5103Project
2. Pull down the code in the main branch
3. Navigate to the App.java file
4. Run the main method and follow the prompt in the terminal or run gradle build

## Project Requirements

(a) Specification: Write formal specification of the program you are writing. <br />
(b) Design: Adapt your software design based on new requirements posted every 3 weeks. <br />
(c) Implementation: Implement your code based on version control system and make
changes to implementation based on new requirements.<br />
(d) Testing: Write unit tests for your code.<br />
(e) Tool Application: Apply code clone detection, static bug detection, and test generation
tool on your code base and report results. <br />


### Code Clone Detection
Click Analyze -> Inspect Code -> Ok. Look for Duplicate, if you don't see it then there were no duplicates

Current report is zero duplicate lines

### Static Bug Detection

Click Analyze -> Inspect Code -> Ok. Look for Probable Bugs

There are currently no bugs


### Specifications

1.0 - Provide the ability to add together two numbers, the input and output will both be number types 
that can support large numbers potentially in the millions<br />
1.1 - The numbers will be entered via command line using a prompt<br />

2.0 - Provide the ability to subtract two numbers, the input and output will both be number types
that can support large numbers potentially in the millions<br />
2.1 - The numbers will be entered via command line using a prompt<br />

3.0 - Given the calculation has been performed provide an output feature that allows the 
user to choose to have the output converted from a number array to a string (sequence of char)<br />
3.1 - Add a comma to the resulting string every three characters from the end<br />


4.0 Allow the numbers to have a decimal point of exactly one.
4.1 Align the numbers by the decimal point by adding zeros at the end if a number does not have a decimal point

