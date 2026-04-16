/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 20: Preventing Search on Empty Train using IllegalStateException

Description:
This program demonstrates defensive programming by preventing search operations when the train
has no bogies. If the collection is empty, the system throws an IllegalStateException and stops
execution immediately.

This use case highlights fail-fast validation and proper handling of invalid system states.

Key Concepts:
- Defensive Programming
- IllegalStateException for Invalid State
- Fail-Fast Principle
- State Validation
- Runtime Exception Handling

@author SAKET-2005
@version 20.0
================================================================================================================
*/

import java.util.*;

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 20.0");
        System.out.println();

        List<String> bogies = new ArrayList<>(); // Empty list

        try
        {
            if (bogies.isEmpty())
            {
                throw new IllegalStateException("Cannot perform search: Train has no bogies");
            }

            // Search logic (will not execute if empty)
            String key = "B101";
            boolean found = bogies.contains(key);

            if (found)
                System.out.println("Bogie FOUND");
            else
                System.out.println("Bogie NOT FOUND");
        }
        catch (IllegalStateException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}