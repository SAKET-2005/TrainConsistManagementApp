/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 7: Sorting Bogies by Capacity using Comparator

Description:
This program demonstrates sorting of passenger bogies based on their seating capacity using a
custom Comparator. Bogies are represented as objects with attributes such as name and capacity.

The system stores bogie objects in a List and applies a Comparator using lambda expressions to
sort them based on capacity. The sorted list is then displayed.

This use case highlights how custom sorting logic can be applied to real-world objects.

Key Concepts:
- Comparator Interface for Custom Sorting
- Custom Objects for Data Modeling
- List Collection for Dynamic Storage
- sort() Method for Ordering
- Lambda Expressions for Concise Logic
- Separation of Data and Logic

@author SAKET-2005
@version 7.0
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
        System.out.println("Version: 7.0");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Sorted Bogies by Capacity:");

        for (Bogie b : bogies)
        {
            System.out.println(b);
        }
    }
}