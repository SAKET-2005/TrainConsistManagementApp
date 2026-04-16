/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 2: Dynamic Insertion and Removal of Passenger Bogies

Description:
This program demonstrates dynamic management of passenger bogies in a train consist using ArrayList.
The system allows insertion, deletion, and validation of bogies at runtime, reflecting real-world
railway operations where coach composition changes frequently.

Passenger bogies such as Sleeper, AC Chair Car, and First Class are added to the train consist.
The system then performs removal of a specific bogie and validates existence using contains().

This use case introduces CRUD-based operations on dynamic data structures and reinforces the concept
of insertion order preservation in ArrayList.

Key Concepts:
- ArrayList for Dynamic Storage
- add() Method for Insertion
- remove() Method for Deletion
- contains() Method for Validation
- Insertion Order Preservation
- CRUD Operations on Collections

@author SAKET-2005
@version 2.0
================================================================================================================
*/

import java.util.*;

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 2.0");
        System.out.println();

        ArrayList<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair Car");
        bogies.add("First Class");

        System.out.println("After Insertion: " + bogies);

        bogies.remove("AC Chair Car");
        System.out.println("After Removal: " + bogies);

        System.out.println("Does Sleeper exist? " + bogies.contains("Sleeper"));
    }
}