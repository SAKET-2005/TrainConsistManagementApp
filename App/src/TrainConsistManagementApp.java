/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 3: Ensuring Unique Bogie IDs using HashSet

Description:
This program demonstrates how to enforce uniqueness of bogie IDs in a train consist using HashSet.
In real-world railway systems, each bogie must have a unique identifier to avoid conflicts and ensure
proper tracking.

The system allows users to add bogie IDs dynamically. Duplicate entries are automatically ignored
by the HashSet, ensuring that only unique bogie IDs are maintained.

This use case highlights the importance of using Set collections when uniqueness is required and
eliminates the need for manual duplicate checks.

Key Concepts:
- HashSet for Unique Storage
- Set Interface for No Duplicates
- add() Method for Insertion
- Automatic Deduplication
- Unordered Storage
- Real-world Data Integrity

@author SAKET-2005
@version 3.0
================================================================================================================
*/

import java.util.*;

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 3.0");
        System.out.println();

        HashSet<String> bogieIDs = new HashSet<>();

        bogieIDs.add("B101");
        bogieIDs.add("B102");
        bogieIDs.add("B103");
        bogieIDs.add("B102"); // Duplicate (will be ignored)

        System.out.println("Unique Bogie IDs: " + bogieIDs);
    }
}