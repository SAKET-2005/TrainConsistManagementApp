/*
================================================================================================================
MAIN CLASS - TrainConsistManagementApp
================================================================================================================

Use Case 13: Performance Comparison using nanoTime()

Description:
This program demonstrates performance comparison between loop-based filtering and stream-based
filtering using System.nanoTime() for precise time measurement.

A collection of bogies is processed using both traditional loop logic and Stream API. The execution
time for each approach is measured and displayed.

This use case highlights benchmarking techniques and encourages evidence-based optimization.

Key Concepts:
- System.nanoTime() for High-Resolution Timing
- Performance Benchmarking
- Loop-Based Processing
- Stream-Based Processing
- Micro-Measurement Awareness
- Evidence-Driven Optimization

@author SAKET-2005
@version 13.0
================================================================================================================
*/

import java.util.*;

class Bogie
{
    String name;
    int capacity;

    Bogie(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;
    }
}

class TrainConsistManagementApp
{
    public static void main(String args[])
    {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Version: 13.0");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 65));

        // Loop-based filtering
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies)
        {
            if (b.capacity > 60)
            {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // Stream-based filtering
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies
                                        .stream()
                                        .filter(b -> b.capacity > 60)
                                        .toList();

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);
    }
}