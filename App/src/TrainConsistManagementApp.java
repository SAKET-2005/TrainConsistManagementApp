/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 18: Searching Bogie ID using Linear Search

Description:
This program demonstrates searching for a specific bogie ID from an unsorted list using the
Linear Search algorithm. The system sequentially checks each element until a match is found.

This use case highlights simple and reliable searching logic that works on unsorted data.

Key Concepts:
- Linear Search Algorithm
- Sequential Traversal
- Equality Comparison using equals()
- Early Termination
- Unsorted Data Handling
- Time Complexity Awareness (O(n))

@author SAKET-2005
@version 18.0
================================================================================================================
*/

import java.util.*;

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 18.0");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        String bogieIDs[] = {"B101", "B205", "B150", "B310", "B220"};

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < bogieIDs.length; i++)
        {
            if (bogieIDs[i].equals(key))
            {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Bogie ID FOUND");
        else
            System.out.println("Bogie ID NOT FOUND");
    }
}