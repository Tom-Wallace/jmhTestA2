package linkedHashTests;
//Tom Wallace
//6482558
//A benchmark of Sorting on LinkedHashSet
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.util.*;

public class LinkedHashSort {
    static LinkedHashSet<Integer> test1;
    static LinkedHashSet<Integer> test2;
    static LinkedHashSet<Integer> test3;
    static LinkedHashSet<Integer> test4;
    static ArrayList<Integer> testList1;
    static ArrayList<Integer> testList2;
    static ArrayList<Integer> testList3;
    static ArrayList<Integer> testList4;
    static int numToTest = 1000000;
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1, warmups = 2)
    public static void insertThrough() {//Test of Throughput on LinkedHashSet
        Collections.sort(testList1);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 2)
    public static void insertTime() {//Test of Average Time on LinkedHashSet
        Collections.sort(testList2);
    }


    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @Fork(value = 1, warmups = 2)
    public static void insertSampleT() {//Test of Sample Time on LinkedHashSet
        Collections.sort(testList3);
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @Fork(value = 1, warmups = 2)
    public static void insertSingleShotT() {//Test of Single Shot Time on LinkedHashSet
        Collections.sort(testList4);
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Testing LinkedHashSet Sort with "+numToTest+" Integers");
        test1 = new LinkedHashSet<Integer>();
        test2 = new LinkedHashSet<Integer>();
        test3 = new LinkedHashSet<Integer>();
        test4 = new LinkedHashSet<Integer>();
        int insert = 0;
        Random rand = new Random(25565);
        for (int i=0; i<numToTest; i++){
            insert = rand.nextInt(1000000);
            test1.add(insert);
            test2.add(insert);
            test3.add(insert);
            test4.add(insert);
        }
        ArrayList<Integer> testList1 = new ArrayList<Integer>(test1);
        ArrayList<Integer> testList2 = new ArrayList<Integer>(test2);
        ArrayList<Integer> testList3 = new ArrayList<Integer>(test3);
        ArrayList<Integer> testList4 = new ArrayList<Integer>(test4);
        org.openjdk.jmh.Main.main(args);
    }
}
