/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 11: Validating Train ID and Cargo Code using Regular Expressions

Description:
This program demonstrates validation of Train ID and Cargo Code formats using Regular Expressions.
The system checks whether the given inputs match predefined patterns to ensure correct formatting.

The Train ID must follow a pattern like TRN-1234, and the Cargo Code must follow a pattern like PET-AB.
The system compiles regex patterns, matches them against user input, and displays validation results.

This use case highlights input validation and format enforcement using regex.

Key Concepts:
- Regular Expressions for Pattern Matching
- Pattern Class for Compiled Regex
- Matcher Class for Applying Patterns
- matches() Method for Validation
- Format Enforcement
- Data Integrity Validation

@author SAKET-2005
@version 11.0
================================================================================================================
*/

import java.util.*;
import java.util.regex.*;

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 11.0");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        if (trainMatcher.matches())
            System.out.println("Train ID is VALID");
        else
            System.out.println("Train ID is INVALID");

        if (cargoMatcher.matches())
            System.out.println("Cargo Code is VALID");
        else
            System.out.println("Cargo Code is INVALID");
    }
}