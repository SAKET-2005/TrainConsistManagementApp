/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 10: Aggregating Total Capacity using Stream Reduction

Description:
This program demonstrates aggregation of seating capacities of bogies using Stream reduction.
Bogies are represented as objects and stored in a List.

The system converts the list into a stream, extracts capacity values using map(), and then
applies reduce() to compute the total seating capacity. The final aggregated value is displayed.

This use case highlights functional-style aggregation for computing numeric results efficiently.

Key Concepts:
- map() for Value Transformation
- reduce() for Aggregation
- Method Reference (Integer::sum)
- Functional Aggregation
- Stream Pipeline
- Numeric Analytics

@author SAKET-2005
@version 10.0
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
}

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 10.0");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        int totalCapacity = bogies
                                .stream()
                                .map(b -> b.capacity)
                                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}