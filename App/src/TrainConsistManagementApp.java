/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 12: Safety Validation using Functional Interfaces and Streams

Description:
This program demonstrates validation of goods bogies using functional programming concepts.
Each bogie has a type and cargo. Safety rules are applied using Stream API and lambda expressions.

The system checks whether all bogies satisfy safety constraints using allMatch(). Specifically,
if a bogie is cylindrical, it must carry only Petroleum. The result determines whether the train
is safety compliant.

This use case highlights stream-based validation and business rule enforcement.

Key Concepts:
- Streams API for Declarative Processing
- allMatch() for Validation
- Lambda Expressions for Rule Definition
- Conditional Logic in Streams
- Short-Circuit Evaluation
- Business Rule Modeling

@author SAKET-2005
@version 12.0
================================================================================================================
*/

import java.util.*;

class GoodsBogie
{
    String type;
    String cargo;

    GoodsBogie(String type, String cargo)
    {
        this.type = type;
        this.cargo = cargo;
    }
}

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 12.0");
        System.out.println();

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafe = bogies
                            .stream()
                            .allMatch(b -> 
                                !b.type.equals("Cylindrical") || 
                                b.cargo.equals("Petroleum")
                            );

        if (isSafe)
            System.out.println("Train is SAFETY COMPLIANT");
        else
            System.out.println("Train is NOT SAFE");
    }
}