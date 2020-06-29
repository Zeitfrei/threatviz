# Springerbedrohung

## HowTo
Run the application using `java -jar springerbedrohung.jar x y piece visualization`

Where x and y are the respective sizes for the board size and piece is the type of chess piece to calculate all possible positions on.
Currently only the knight is supported here. visualization determines the method used to visualize the result. Options are raw and ascii.
All arguments are optional if none are supplied the application starts with the default values of 8 8 knight ascii.

Example: `java -jar springerbedrohung.jar 8 8 knight ascii`
## Description
The goal of this application in is to calculate all possible pairs, on a board of variable size, where 2 chess pieces are a threat to one another.
The result is then visualized.
## Solution
The applications architecture is prepared to handle different board sizes as well as different types of figures.
Encapsulation of responsibilities is handled through models and classes for each functionality.
This aims to make the application expandable and easier to maintain, while also not going overboard with the separation of concern for an application of this size.

Calculation is done in a very brute force manner, determining for all fields of the board each possible move 
and interpreting the destination position of said move as the opposing piece. 
This approach finds all combinations where 2 pieces of the same type are a threat to eachother.

The visualization is done in 2 ways.
One is to just print the number of combinations and the figures positions as pairs.
The other is an ASCII representations of a chess board with the given size and markings of the pieces for each pair.

For compatibility reasons final compilation with the maven-compiler-plugin is done with with Java 8 since the code doesn't use any newer language features.

## Improvements
- ### Unit Tests
    Unit tests should be added for calculation and visualization methods.
- ### Better algorithm for calculating possible combinations
    The implemented solution to calculated all possible pairs where 2 chess pieces are threat is not very smart.
    This brute force approach won't scale too well with bigger board sizes.
    Supporting multiple algorithms and displaying their performance might be interesting as a showcase as well.
- ### Exception Handling
    Exceptions should be handled in a proper way for better robustness of the application.
- ### User interaction and GUI
    Direct user interaction within a graphical user interface both for visualization as well as interaction
    Shifting the application to an MVC pattern to handle user requests would make sense in this case.
    This will bring even better separation of concerns and better data flow, allowing the visualization layer only to
    act changes to the data layer.
 - ### Configuration
    Configuration of the application along with some changes in the application will make it easier to add and define additional chess pieces.