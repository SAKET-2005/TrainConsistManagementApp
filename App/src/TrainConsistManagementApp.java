/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 19: Searching Bogie ID using Binary Search

Description:
This program demonstrates efficient searching of a bogie ID using the Binary Search algorithm.
The search is performed on a sorted array, repeatedly dividing the search space in half until
the element is found or the range is exhausted.

This use case highlights optimized searching and the importance of sorted data.

Key Concepts:
- Binary Search Algorithm
- Divide-and-Conquer Strategy
- Sorted Data Precondition
- Index-Based Traversal (low, high, mid)
- String Comparison using compareTo()
- Time Complexity Awareness (O(log n))

@author SAKET-2005
@version 19.0
================================================================================================================
*/

import java.util.*;

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 19.0");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        String bogieIDs[] = {"B101", "B150", "B205", "B220", "B310"}; // Sorted array

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high)
        {
            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIDs[mid]);

            if (result == 0)
            {
                found = true;
                break;
            }
            else if (result > 0)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        if (found)
            System.out.println("Bogie ID FOUND");
        else
            System.out.println("Bogie ID NOT FOUND");
    }
}