package linkedHashTests;
//Tom Wallace
//6482558
//A benchmark of Insertion, Sorting, and Searching on LinkedHashSet
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;

public class LinkedHashAll {
    static int numToTest = 1000000;
    static LinkedHashSet<Integer> test2;
    static LinkedHashSet<Integer> test3;
    static ArrayList<Integer> testList2;

    @Benchmark
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 2)
    public static void LinkedHashInsert() {//Test of Insert on LinkedHashset
        LinkedHashSet test1 = new LinkedHashSet();
        for (int i=0; i<numToTest; i++){
            test1.add(i);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 2)
    public static void LinkedHashSort() {//Test of Sort on LinkedHashset
        Collections.sort(testList2);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 2)
    public static void LinkedHashSearch() {//Test of Search on LinkedHashSet
        test3.contains(numToTest/2);
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Testing LinkedHashSet Insert with "+numToTest+" Integers");
        test2 = new LinkedHashSet<Integer>();
        test3 = new LinkedHashSet<Integer>();
        Random rand = new Random(25565);
        int insert = 0;
        for (int i=0; i<numToTest; i++){
            insert = rand.nextInt(1000000);
            test2.add(insert);
            test3.add(i);
        }
        ArrayList<Integer> testList2 = new ArrayList<Integer>(test2);

        org.openjdk.jmh.Main.main(args);
    }
}
