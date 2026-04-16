/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 16: Sorting Capacities using Bubble Sort

Description:
This program demonstrates sorting of passenger bogie capacities using the Bubble Sort algorithm.
Instead of using built-in sorting methods, the system manually compares and swaps adjacent elements
until the array is sorted.

This use case highlights algorithmic thinking and low-level implementation of sorting logic.

Key Concepts:
- Bubble Sort Algorithm
- Array Manipulation
- Nested Loop Processing
- Swapping Logic
- Algorithmic Thinking
- Time Complexity Awareness (O(n^2))

@author SAKET-2005
@version 16.0
================================================================================================================
*/

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 16.0");
        System.out.println();

        int capacities[] = {72, 60, 40, 65, 80};

        System.out.println("Original Capacities:");
        for (int c : capacities)
        {
            System.out.print(c + " ");
        }
        System.out.println();

        // Bubble Sort
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (capacities[j] > capacities[j + 1])
                {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Capacities:");
        for (int c : capacities)
        {
            System.out.print(c + " ");
        }
    }
}