/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 5: Maintaining Order with Unique Bogies using LinkedHashSet

Description:
This program demonstrates the use of LinkedHashSet to maintain insertion order while ensuring
uniqueness of bogies in a train consist. Unlike HashSet, LinkedHashSet preserves the order in
which elements are added, making it suitable for representing real-world train formations.

The system allows insertion of bogies, including an intentional duplicate. The duplicate is
automatically ignored, and the final ordered formation is displayed.

This use case highlights how Java combines ordering with uniqueness using LinkedHashSet.

Key Concepts:
- LinkedHashSet for Ordered Unique Storage
- Set Interface for No Duplicates
- add() Method for Insertion
- Automatic Deduplication
- Insertion Order Preservation
- Ordered Iteration

@author SAKET-2005
@version 5.0
================================================================================================================
*/

import java.util.*;

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 5.0");
        System.out.println();

        LinkedHashSet<String> train = new LinkedHashSet<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");
        train.add("Sleeper"); // Duplicate (ignored)

        System.out.println("Final Train Formation: " + train);
    }
}