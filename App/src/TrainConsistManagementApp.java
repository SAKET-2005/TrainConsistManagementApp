/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 4: Managing Train Order using LinkedList

Description:
This program demonstrates the use of LinkedList to manage the order of bogies in a train consist.
Unlike ArrayList, LinkedList uses a node-based structure which allows efficient insertion and
deletion of elements from both ends and the middle.

The system adds multiple bogies, inserts a Pantry Car at a specific position, and removes bogies
from the beginning and end. The final ordered train consist is displayed.

This use case models real-world train composition where bogies can be attached or detached dynamically.

Key Concepts:
- LinkedList for Dynamic Node-Based Storage
- addFirst() and addLast() Methods
- add(index, element) for Middle Insertion
- removeFirst() and removeLast() Methods
- Order Preservation
- Efficient Insertions and Deletions

@author SAKET-2005
@version 4.0
================================================================================================================
*/

import java.util.*;

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 4.0");
        System.out.println();

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        train.add(2, "Pantry Car");
        System.out.println("After Inserting Pantry Car: " + train);

        train.removeFirst();
        train.removeLast();

        System.out.println("Final Train Consist: " + train);
    }
}