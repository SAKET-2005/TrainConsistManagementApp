/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 15: Handling Unsafe Cargo using Custom Runtime Exception

Description:
This program demonstrates safe handling of unsafe cargo assignments using a custom runtime exception.
If incompatible cargo is assigned to a bogie (e.g., Petroleum to a Rectangular bogie), an exception
is thrown and handled gracefully using try-catch-finally blocks.

The system ensures that the application does not crash and continues execution safely.

Key Concepts:
- try-catch-finally for Structured Exception Handling
- Runtime Exception for Unchecked Errors
- Custom Runtime Exception
- throw Keyword for Error Signaling
- Graceful Failure Handling
- finally Block for Cleanup/Logging

@author SAKET-2005
@version 15.0
================================================================================================================
*/

class CargoSafetyException extends RuntimeException
{
    CargoSafetyException(String message)
    {
        super(message);
    }
}

class GoodsBogie
{
    String shape;
    String cargo;

    void assignCargo(String shape, String cargo)
    {
        try
        {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum"))
            {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }

            this.shape = shape;
            this.cargo = cargo;

            System.out.println("Cargo assigned successfully");
        }
        catch (CargoSafetyException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            System.out.println("Assignment process completed");
        }
    }
}

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 15.0");
        System.out.println();

        GoodsBogie b1 = new GoodsBogie();

        b1.assignCargo("Rectangular", "Petroleum"); // Unsafe
        b1.assignCargo("Cylindrical", "Petroleum"); // Safe

        System.out.println("Program continues safely...");
    }
}