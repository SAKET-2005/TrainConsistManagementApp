/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 17: Sorting Bogie Names using Arrays.sort()

Description:
This program demonstrates sorting of bogie type names alphabetically using Java’s built-in
Arrays.sort() method. The system relies on Java’s optimized sorting algorithms to efficiently
arrange the elements.

This use case highlights the importance of using standard library methods for clean, efficient,
and maintainable code.

Key Concepts:
- Arrays.sort() for Built-in Sorting
- Natural Ordering of Strings
- Time Complexity Awareness (O(n log n))
- Library Optimization
- Readable Code Design
- Separation of Algorithm and Usage

@author SAKET-2005
@version 17.0
================================================================================================================
*/

import java.util.*;

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 17.0");
        System.out.println();

        String bogieTypes[] = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        System.out.println("Original Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));

        Arrays.sort(bogieTypes);

        System.out.println("Sorted Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));
    }
}