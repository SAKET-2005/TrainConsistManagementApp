/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 6: Mapping Bogies to Capacity using HashMap

Description:
This program demonstrates the use of HashMap to associate each bogie with its seating or load
capacity using a key–value mapping structure. Each bogie name is stored as a key, and its
corresponding capacity is stored as the value.

The system inserts multiple bogie-capacity pairs and iterates through the map using entrySet()
to display each bogie along with its capacity.

This use case highlights how HashMap enables efficient storage and retrieval of related data
using key-based access.

Key Concepts:
- HashMap for Key–Value Storage
- Map Interface for Data Mapping
- put() Method for Insertion
- Key–Value Association
- entrySet() for Iteration
- Fast Lookup Using Keys

@author SAKET-2005
@version 6.0
================================================================================================================
*/

import java.util.*;

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 6.0");
        System.out.println();

        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}