/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 8: Filtering Bogies using Stream API

Description:
This program demonstrates filtering of passenger bogies based on seating capacity using the
Stream API. Bogies are represented as objects and stored in a List.

The system converts the list into a stream, applies a filter condition to select bogies with
capacity greater than a specified value, and collects the result into a new list. The filtered
bogies are then displayed.

This use case highlights the use of functional-style programming for cleaner and more readable code.

Key Concepts:
- Stream API for Declarative Processing
- stream() Method for Pipeline Creation
- filter() Operation for Conditional Selection
- Lambda Expressions for Concise Logic
- collect() / toList() for Result Collection
- Declarative Programming Style

@author SAKET-2005
@version 8.0
================================================================================================================
*/

import java.util.*;

class Bogie
{
    String name;
    int capacity;

    Bogie(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString()
    {
        return name + " -> " + capacity;
    }
}

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 8.0");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        List<Bogie> filteredBogies = bogies
                                        .stream()
                                        .filter(b -> b.capacity > 60)
                                        .toList();

        System.out.println("Filtered Bogies (Capacity > 60):");

        for (Bogie b : filteredBogies)
        {
            System.out.println(b);
        }
    }
}