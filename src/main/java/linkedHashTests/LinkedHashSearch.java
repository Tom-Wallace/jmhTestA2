package linkedHashTests;
//Tom Wallace
//6482558
//A benchmark of Searching on LinkedHashSet
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.util.LinkedHashSet;

public class LinkedHashSearch {
    static LinkedHashSet<Integer> test1;
    static LinkedHashSet<Integer> test2;
    static LinkedHashSet<Integer> test3;
    static LinkedHashSet<Integer> test4;
    static int numToTest = 1000000;
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1, warmups = 2)
    public static void searchThrough() {//Test of Throughput on Hashset
        test1.contains(numToTest/2);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 2)
    public static void searchTime() {//Test of Average Time on Hashset
        test2.contains(numToTest/2);
    }


    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @Fork(value = 1, warmups = 2)
    public static void searchSampleT() {//Test of Sample Time on HashSet
        test3.contains(numToTest/2);
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @Fork(value = 1, warmups = 2)
    public static void searchSingleShotT() {//Test of Single Shot Time on HashSet
        test4.contains(numToTest/2);
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Testing HashSet Search with "+numToTest+" Integers");
        test1 = new LinkedHashSet<Integer>();
        test2 = new LinkedHashSet<Integer>();
        test3 = new LinkedHashSet<Integer>();
        test4 = new LinkedHashSet<Integer>();
        for (int i=0; i<numToTest; i++){
            test1.add(numToTest);
            test2.add(numToTest);
            test3.add(numToTest);
            test4.add(numToTest);
        }
        org.openjdk.jmh.Main.main(args);
    }
}
