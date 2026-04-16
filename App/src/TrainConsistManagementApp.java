/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 9: Grouping Bogies using Stream Collectors

Description:
This program demonstrates grouping of passenger bogies into categories using the Stream API
and Collectors.groupingBy(). Bogies are represented as objects and stored in a List.

The system converts the list into a stream, applies a grouping function to classify bogies,
and collects the result into a Map where each key represents a category and the value is a list
of bogies in that category.

This use case highlights structured data transformation from flat collections into grouped data.

Key Concepts:
- Collectors.groupingBy() for Classification
- Stream Pipeline for Data Processing
- Map Output Structure for Grouped Data
- Lambda Expressions for Classification Logic
- Data Aggregation
- Structured Transformation

@author SAKET-2005
@version 9.0
================================================================================================================
*/

import java.util.*;
import java.util.stream.*;

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
        System.out.println("Version: 9.0");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 70));

        Map<String, List<Bogie>> groupedBogies = bogies
                                                    .stream()
                                                    .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("Grouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}