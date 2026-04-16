/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 14: Enforcing Capacity Rules using Custom Exception

Description:
This program demonstrates how to prevent invalid passenger bogies from being created by enforcing
capacity rules using a custom exception. If a bogie is created with capacity less than or equal
to zero, an exception is thrown.

The system ensures that only valid bogies are added, maintaining data integrity and enforcing
business constraints at the object creation level.

Key Concepts:
- Custom Exception for Domain-Specific Errors
- Exception Inheritance
- throw Keyword for Raising Exceptions
- throws Declaration in Constructor
- Fail-Fast Validation
- Business Rule Enforcement

@author SAKET-2005
@version 14.0
================================================================================================================
*/

import java.util.*;

class InvalidCapacityException extends Exception
{
    InvalidCapacityException(String message)
    {
        super(message);
    }
}

class Bogie
{
    String name;
    int capacity;

    Bogie(String name, int capacity) throws InvalidCapacityException
    {
        if (capacity <= 0)
        {
            throw new InvalidCapacityException("Capacity must be greater than 0");
        }

        this.name = name;
        this.capacity = capacity;
    }

    public String toString()
    {
        return name + " -> " + capacity;
    }
}

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 14.0");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();

        try
        {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", -10)); // Invalid
            bogies.add(new Bogie("First Class", 40));
        }
        catch (InvalidCapacityException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Valid Bogies in Train:");

        for (Bogie b : bogies)
        {
            System.out.println(b);
        }
    }
}